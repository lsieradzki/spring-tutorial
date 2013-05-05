package spring.tutorial.db;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Scope("prototype")
@Repository
@Transactional(propagation = Propagation.MANDATORY)
public class AdminDao {
	@Autowired
	private Session session;
	
	@Transactional(propagation = Propagation.MANDATORY)
	public Client getClientById(long id) {
		System.out.println(session.hashCode());
		return (Client) session.get(Client.class, id);
	}
	
}
