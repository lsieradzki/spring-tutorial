package spring.tutorial.wiring;

import java.util.List;

public class Wolf extends Beast {
	private List<Country> countries;
	
	
	
	public List<Country> getCountries() {
		return countries;
	}

	public void setCountries(List<Country> countries) {
		this.countries = countries;
	}
	
}
