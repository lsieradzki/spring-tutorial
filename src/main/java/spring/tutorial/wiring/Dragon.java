package spring.tutorial.wiring;

import org.apache.log4j.Logger;

public class Dragon extends Beast {
	private static final Logger log = Logger.getLogger(Dragon.class);
	
	public Dragon() {
		log.info("Dragon constructor");
	}

}
