package spring.tutorial.db;

import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	private static final Logger log = Logger.getLogger(Main.class);

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"spring/tutorial/db/beans.xml");
		ctx.getBean("jdbcDao", JdbcDao.class).query();
		ctx.getBean("clientDao", ClientDao.class).addClient();
		log.info(ctx.getBean("clientDao", ClientDao.class).findClient(1));

	}

}
