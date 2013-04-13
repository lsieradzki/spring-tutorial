package spring.tutorial.autowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class Sister {
	@Autowired 
	@Family
	private Parent parent;
	
	public void setSomeone(Parent parent) {
		this.parent = parent;
	}

	public Parent getSomeone() {
		return parent;
	}
	
	

}
