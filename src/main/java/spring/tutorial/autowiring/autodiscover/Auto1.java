package spring.tutorial.autowiring.autodiscover;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Auto1 {
	@Autowired
	private Auto2 auto;

	public Auto2 getAuto() {
		return auto;
	}

	public void setAuto(Auto2 auto) {
		this.auto = auto;
	}
}
