package spring.tutorial.db;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring/tutorial/db/beans.xml");
		ctx.getBean("jdbcDao", JdbcDao.class).query();
	}

}
