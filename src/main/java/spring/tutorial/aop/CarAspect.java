package spring.tutorial.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CarAspect {
	private static final Logger log = Logger.getLogger(CarAspect.class);
	
	@Pointcut("execution(* spring.tutorial.aop.Car.startEngine())")
	public void startEnginePointcut(){}

	@Pointcut(value = "execution(* spring.tutorial.aop.Car.addFuel(..)) && args(litres)")
	public void addFuelPointcut(int litres){}
	
	@Around("execution(* spring.tutorial.aop.Car.startEngine())")
	public void aroundStartEngine(ProceedingJoinPoint joinPoint) throws Throwable {
		log.info("aroundStartEngine - around before");
		log.info(joinPoint.proceed());
		log.info("aroundStartEngine - around after");
	}
	
	@Before("startEnginePointcut()")
	public void beforeStartEngine() throws Throwable {
		log.info("beforeStartEngine");
	}
	
	@After("startEnginePointcut()")
	public void afterStartEngine() throws Throwable {
		log.info("afterStartEngine");
	}
	
	@Before(value = "addFuelPointcut(litres)")
	public void beforeAddFuel(int litres) {
		log.info("beforeAddFuel " + litres);
	}
}
