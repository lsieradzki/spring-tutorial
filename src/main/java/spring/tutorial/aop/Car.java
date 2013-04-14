package spring.tutorial.aop;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class Car {
	private static final Logger log = Logger.getLogger(Car.class);
	
	public void startEngine() {
		log.info("startEngine");
	}
	
	public void addFuel(int litres) {
		log.info("addFuel " + litres);
	}
}
