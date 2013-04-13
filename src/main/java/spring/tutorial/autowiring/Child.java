package spring.tutorial.autowiring;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Child {
	@Value("#{parent.name + ' ' + 2 ^2 + ' ' + systemProperties['java.home']}")
	private String name;
	
	@Autowired @Named("parent")
	private Parent parent;
	
	@Inject @Qualifier("mum")
	private Mother mother;
	
	public void setParent(Parent parent) {
		this.parent = parent;
	}

	public Parent getParent() {
		return parent;
	}

	public Mother getMother() {
		return mother;
	}

	public void setMother(Mother mother) {
		this.mother = mother;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
