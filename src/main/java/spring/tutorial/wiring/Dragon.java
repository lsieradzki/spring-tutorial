package spring.tutorial.wiring;

import java.util.List;

import org.apache.log4j.Logger;

public class Dragon extends Beast {
	private static final Logger log = Logger.getLogger(Dragon.class);
	
	private List<Country> firstCity;
	
	private List<Country> secondCity;
	
	private boolean isDangerous;
	
	private int citySize;
	
	public Dragon() {
		log.info("Dragon constructor");
	}

	public boolean isDangerous() {
		return isDangerous;
	}

	public void setDangerous(boolean isDangerous) {
		this.isDangerous = isDangerous;
	}



	public List<Country> getFirstCity() {
		return firstCity;
	}

	public void setFirstCity(List<Country> firstCity) {
		this.firstCity = firstCity;
	}

	public List<Country> getSecondCity() {
		return secondCity;
	}

	public void setSecondCity(List<Country> secondCity) {
		this.secondCity = secondCity;
	}

	public int getCitySize() {
		return citySize;
	}

	public void setCitySize(int citySize) {
		this.citySize = citySize;
	}
	
}
