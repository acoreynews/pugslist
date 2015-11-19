package pugData;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import pugslist.Pug;

@Component
@Transactional
public class PugDAO {

	@PersistenceContext
	private EntityManager em;

	public String getPugName(int id) {

		Pug p = em.find(Pug.class, id);

		return p.getPugName();

	}

	public void addPug(Pug pug) {
		em.persist(pug);
	}

	public List<Pug> getAllPugs() {

		List<Pug> pugs = em.createQuery("select p from Pug p", Pug.class).getResultList();
		return pugs;

	}

}
