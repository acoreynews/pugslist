package pugslist;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class GeneratePugs implements ServletContextListener {

	public static final String PUG_STATS = "pugStats";

	public void pugsGenerated(ServletContextEvent ev) {

		List<Pug> pugs = new ArrayList<>();

		pugs.add(new Pug("Panamanian Pug", 40, 1, "brown"));
		pugs.add(new Pug("Bull Pug", 35, 2, "tan"));
		pugs.add(new Pug("English Pug", 43, 4, "grey"));

		ev.getServletContext().setAttribute(PUG_STATS, pugs);
	}
	
	public void pugRemoved (ServletContextEvent ev)
    {
        ev.getServletContext ().removeAttribute (PUG_STATS);
    }

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}