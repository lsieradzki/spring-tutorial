package spring.tutorial.wiring;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.DestructionAwareBeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Knight implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, BeanPostProcessor, InitializingBean, DisposableBean, DestructionAwareBeanPostProcessor {
	private static final Logger log = Logger.getLogger(Knight.class);
	
	private String name;
	
	private String weapon = "Nothing";
	
	public Knight(String name) {
		this.name = name;
		log.info("1. Knight constructor: " + this.name);
	}
	
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public String getWeapon() {
		return weapon;
	}

	@Override
	public void setBeanName(String name) {
		log.info("2. setBeanName: " + name);
	}

	@Override
	public void setBeanFactory(BeanFactory factory) throws BeansException {
		log.info("3. setBeanFactory: " + factory);
	}
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		log.info("4. setApplicationContext: " + applicationContext);
	}
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		log.info("5. postProcessBeforeInitialization: " + bean + " " + beanName);
		return bean;
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		log.info("6. afterPropertiesSet");
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		log.info("7. postProcessAfterInitialization: " + bean + " " + beanName);
		return bean;
	}
	
	private void prepareForFight() {
		log.info("Prepare for fight!");
	}


	@Override
	public void postProcessBeforeDestruction(Object bean, String beanName) throws BeansException {
		log.info("postProcessBeforeDestruction: " + bean + " " + beanName);
	}

	private void fallAsleep() {
		log.info("fallAsleep!");
	}
	
	@Override
	public void destroy() throws Exception {
		log.info("destroy!");
	}


}
