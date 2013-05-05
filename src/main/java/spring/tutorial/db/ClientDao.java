package spring.tutorial.db;

import org.hibernate.FlushMode;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Scope("prototype")
@Repository
@Transactional(propagation = Propagation.MANDATORY)
public class ClientDao {
	
	@Autowired
	private Session session;
	
	@Autowired
	private AdminDao adminDao;

	@Transactional(propagation = Propagation.MANDATORY)
	public void addClient() {
		session.setFlushMode(FlushMode.MANUAL);
		Client client = new Client();
		System.out.println(client);
		session.getTransaction().begin();
		session.save(client);
		System.out.println(session.hashCode());
		System.out.println(adminDao.getClientById(1L));
		session.getTransaction().rollback();
	}
	
	public Client findClient(long clientId) {
		session.beginTransaction();
		Client c = (Client) session.createQuery("from Client where id=?").setLong(0, clientId).uniqueResult();
		session.getTransaction().commit();
		return c;
	}

}
