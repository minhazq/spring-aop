package org.spring.aop.spring_aop.with_context;

import org.springframework.stereotype.Component;

@Component
public class MyTarget implements MyTargetInterface{

	public void method1() {
		System.out.println("Method 1 is called");
		
	}

	public void method2() {
		System.out.println("Method 2 is called");
		
	}

	public void method3() {
		System.out.println("Method 3 is called");
		
	}

}
