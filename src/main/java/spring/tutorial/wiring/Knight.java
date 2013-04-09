package spring.tutorial.wiring;

import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.DestructionAwareBeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Knight implements BeanNameAware, BeanFactoryAware, ApplicationContextAware,
							   DestructionAwareBeanPostProcessor, // DestructionAwareBeanPostProcessor extends BeanPostProcessor 
							   									  // methods not invoked on Knight but on other beans within ApplicationContext
							   InitializingBean, DisposableBean {
	
	private static final Logger log = Logger.getLogger(Knight.class);
	
	private String name;
	
	private String weapon = "Nothing";
	
	private String country;
	
	private Map<String, Beast> beasts;
	
	public Knight(String name) {
		this.name = name;
		log.info("1. Knight constructor: " + this.name);
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
		log.info("postProcessBeforeInitialization: " + bean + " " + beanName);
		// method is not invoked during Knight bean lifecycle
		return bean;
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		log.info("5. afterPropertiesSet");
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		log.info("postProcessAfterInitialization: " + bean + " " + beanName);
		// method is not invoked during Knight bean lifecycle
		return bean;
	}
	
	private void initMethod() {
		log.info("6. init method");
	}

	@Override
	public void postProcessBeforeDestruction(Object bean, String beanName) throws BeansException {
		log.info("postProcessBeforeDestruction: " + bean + " " + beanName);
		// method is not invoked during Knight bean lifecycle
	}

	@Override
	public void destroy() throws Exception {
		log.info("7. disposable bean");
	}
	
	private void destroyMethod() {
		log.info("8. destory method");
	}
	
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public String getWeapon() {
		return weapon;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Map<String, Beast> getBeasts() {
		return beasts;
	}

	public void setBeasts(Map<String, Beast> beasts) {
		this.beasts = beasts;
	}
	
}
