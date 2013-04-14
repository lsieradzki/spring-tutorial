package spring.tutorial.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring/tutorial/aop/beans.xml");
		ctx.getBean("car", Car.class).startEngine();
		ctx.getBean("car", Car.class).addFuel(10);
	}

}
