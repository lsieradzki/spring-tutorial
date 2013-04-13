package spring.tutorial.autowiring.autodiscover;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean
	public Engine1 engine1() {
		return new Engine1();
	}

}
