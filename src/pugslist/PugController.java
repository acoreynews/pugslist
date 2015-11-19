package pugslist;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import pugData.PugDAO;


@Controller
public class PugController {
	
	@Autowired
	private PugDAO pugDao;
	
	
	@RequestMapping("getPugName.do")
	public ModelAndView getPugName() {
		return new ModelAndView("pugs.jsp",
				"pugs", pugDao.getPugName(1));
	}

	@RequestMapping("Home.do")
	public String home()
	{
		return "home.jsp";
	}
	
	
	@RequestMapping("Query.do")
	public String query()
	{
		return "query.jsp";
	}
	
	@RequestMapping("Pugs.do")
	public ModelAndView pugs()
	{
		List<Pug> pugs = pugDao.getAllPugs();

		return new ModelAndView ("pugs.jsp", "pugs", pugs);
	}
	
	
	
	
	@RequestMapping(value="CreateNewPugListing.do", method=RequestMethod.GET)
	public ModelAndView GetPugListing()
	{
		return new ModelAndView ("CreateNewPugListing.jsp");
	}
	
	
	@RequestMapping(value="CreateNewPugListing.do", method=RequestMethod.POST)
	public ModelAndView AddPugListing(@RequestParam(name="TYPE") String TYPE, @RequestParam(name="age") int age,
			@RequestParam(name="weight") int weight, @RequestParam(name="color") String color)
	{
		Pug p = new Pug(TYPE, age, weight, color);
		pugDao.addPug(p);
		return new ModelAndView("home.jsp");
	}
	
	
	@SuppressWarnings ("unchecked")
	private List<Pug> getPugs (ServletContext context)
	{
		Object attr = context.getAttribute (GeneratePugs.PUG_STATS);
        return (List<Pug>) attr;
	}
	

	
}
