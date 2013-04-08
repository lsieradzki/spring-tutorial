package spring.tutorial.wiring;

import org.apache.log4j.Logger;

public abstract class Beast {
	private static final Logger log = Logger.getLogger(Beast.class);

	private String name;
	
	public Beast() {
		log.info("Beast constructor");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		log.info("setName: " + name);
		this.name = name;
	}

}
