package spring.tutorial.autowiring;

import javax.inject.Inject;
import javax.inject.Named;

public class Parent {
	@Inject @Named("child")
	private Child child;
	
	private String name;
	
	public void setChild(Child child) {
		this.child = child;
	}
	
	public Child getChild() {
		return child;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
