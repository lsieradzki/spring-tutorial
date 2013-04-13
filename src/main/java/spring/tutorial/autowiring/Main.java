package spring.tutorial.autowiring;

import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.tutorial.autowiring.autodiscover.Auto1;
import spring.tutorial.autowiring.autodiscover.Engine1;

public class Main {
	private static final Logger log = Logger.getLogger(Main.class);


	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring/tutorial/autowiring/beans.xml");
		log.info(ctx.getBean("parent", Parent.class).getChild());
		log.info(ctx.getBean("sister", Sister.class).getSomeone());
		log.info(ctx.getBean("child", Child.class).getParent());
		log.info(ctx.getBean("child", Child.class).getMother());
		log.info(ctx.getBean("child", Child.class).getName());
		log.info(ctx.getBean("auto1", Auto1.class).getAuto());
		log.info(ctx.getBean("engine1", Engine1.class));
	}

}
