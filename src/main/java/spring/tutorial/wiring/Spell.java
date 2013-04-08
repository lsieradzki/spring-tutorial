package spring.tutorial.wiring;

import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spell {
	private static final Logger log = Logger.getLogger(Spell.class);
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring/tutorial/wiring/beans.xml");
		log.info(ctx.getBean("knight", Knight.class).getWeapon());
		log.info(ctx.getBean("dragon", Dragon.class).getName());
		log.info(ctx.getBean("wolf", Wolf.class).getName());
		ctx.close();
	}

}
