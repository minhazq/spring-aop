package org.spring.aop.proxy;

public class MyTarget implements MyTargetInterface{

	
	@Override
	public void method1() {
		System.out.println("target method1 is called");
		
	}

	@Override
	public void method2() {
		System.out.println("target method2 is called");
		
	}

	@Override
	public void method3() {
		System.out.println("target method3 is called");
		
	}

}
