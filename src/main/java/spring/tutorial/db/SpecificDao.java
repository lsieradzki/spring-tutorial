package spring.tutorial.db;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@Scope("prototype")
public class SpecificDao extends AbstractDao {

	public void doSth() {
		entityManager.persist(new Client());
	}
}
