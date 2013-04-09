package spring.tutorial.wiring;

import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spell {
	private static final Logger log = Logger.getLogger(Spell.class);
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring/tutorial/wiring/beans.xml");
		log.info(ctx.getBean("knight", Knight.class).getWeapon() + " " + ctx.getBean("knight", Knight.class).getCountry());
		log.info(ctx.getBean("knight", Knight.class).getBeasts());
		log.info(ctx.getBean("dragon", Dragon.class).getName());
		log.info(ctx.getBean("dragon", Dragon.class).getFirstCity());
		log.info(ctx.getBean("dragon", Dragon.class).getCitySize());
		log.info(ctx.getBean("wolf", Wolf.class).getName());
		log.info(ctx.getBean("propertyHolder", PropertyHolder.class).getProperty() + " " + ctx.getBean("propertyHolder", PropertyHolder.class).getValue());
		log.info(ctx.getBean("propertyHolder", PropertyHolder.class).getRandomValue());
		ctx.close();
	}

}
