package com.spring.mvc.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import java.util.logging.Logger;

@Aspect//Mandatory
@EnableAspectJAutoProxy//Get details automatically
@Component //before after after returning after throwing 
public class CalculatorAspect {
	  Logger logger = Logger.getLogger(getClass().getName());

	 //Execute before com.spring.mvc.controller all the controller class and all the methods
	@Before(value = "execution(* com.spring.mvc.controller.*.*(..))")
	public void beforeAdvice(JoinPoint joinPoint) {
//		System.out.println("Entering Method : " + joinPoint.getSignature().getName());
	    logger.info("Entering Method : " + joinPoint.getSignature().getName());  // Compliant, output via logger

	}
	//To be specific to doCalculate () inside CalculateController
	@Before(value = "execution(* com.spring.mvc.controller.CalculatorController.doCalculate(..))")
	public void beforedoCalculateAdvice(JoinPoint joinPoint) {
//		System.out.println("Calculation Is Going On");
		logger.info("Calculation Is Going On");
	}
	
	//To be specific to processEmployee() inside EmployeeController
	@Before(value = "execution(* com.spring.mvc.controller.EmployeeController.processEmployee(..))")
	public void beforeprocessEmployeeAdvice(JoinPoint joinPoint) {
//		System.out.println("Fetching Employee Information");
		logger.info("Fetching Employee Information");
	}
	//Execute after com.spring.mvc.controller
	@After(value = "execution(* com.spring.mvc.controller.*.*(..))")
	public void afterAdvice(JoinPoint joinPoint) {
//		System.out.println("Exiting Method : " + joinPoint.getSignature().getName());
		logger.info("Exiting Method : " + joinPoint.getSignature().getName());
	}
	
	
	@After(value = "execution(* com.spring.mvc.controller.LoginController.processLogin(..))")
	public void afterprocessLoginAdvice(JoinPoint joinPoint) {
//		System.out.println("Logout Successfully");
		logger.info("Logout Successfully");
	}
	
	@AfterThrowing(value = "execution(* com.spring.mvc.controller.*.*(..))")
		public void afterException(JoinPoint joinPoint) {
//			System.out.println("Exception Method : " + joinPoint.getSignature().getName());
		logger.info("Exception Method : " + joinPoint.getSignature().getName());
		}
	}