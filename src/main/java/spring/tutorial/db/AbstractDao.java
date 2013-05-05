package spring.tutorial.db;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;


@Repository
public abstract class AbstractDao {
	
//	@Autowired
//	private SessionFactory sessionFactory;
	
	@PersistenceContext(unitName = "simple-unit")
	protected EntityManager entityManager;
	
	@PersistenceUnit
	protected EntityManagerFactory factory;
	
//	public final Session getSession() {
//		return sessionFactory.getCurrentSession();
//	}
}
