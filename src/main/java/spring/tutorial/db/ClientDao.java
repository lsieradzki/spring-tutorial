package spring.tutorial.db;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ClientDao {
	@Autowired
	private SessionFactory sessionFactory;

	public void addClient() {
		Client client = new Client();
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.persist(client);
		session.getTransaction().commit();
	}
	
	public Client findClient(long clientId) {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		Client c = (Client) session.createQuery("from Client where id=?").setLong(0, clientId).uniqueResult();
		session.getTransaction().commit();
		return c;
	}

}
