package org.spring.aop.spring_aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//This class is Advice
@Aspect //I must annotate aspect to make this class for Advice
@Component // Spring can not inject Advice if it is not a spring bean
public class UserRepoMonitor {

	@Before("execution(* org.spring.aop.spring_aop.JdbcTemplateUserRepo.findUserById(..))")
	//The above is point-cut expression. I am telling in which method is joinpoint for this advice 
	public void beforeFindById(JoinPoint joinPoint) {
		System.out.println("I am being called from advice");
		System.out.println(joinPoint.getSignature().getName());
	}
}
