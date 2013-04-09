package spring.tutorial.wiring;

import java.util.Random;

public class PropertyHolder {
	private String property;
	
	private String value;
	
	private String randomValue;

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getRandomValue() {
		return randomValue;
	}

	public void setRandomValue(String randomValue) {
		this.randomValue = randomValue;
	}
	
	public static String getStaticString() {
		return "Static String!";
	}
	
	public String getRandomString() {
		return new Random().nextInt(2) > 0 ? null : "Random String!";
	}
}
