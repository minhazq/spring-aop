package org.spring.aop.spring_aop.without_context;
import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

public class MyAspect implements MethodBeforeAdvice{


	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		System.out.println("before() is called ");
		
	}
}
