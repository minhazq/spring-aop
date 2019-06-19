package org.spring.aop.spring_aop.without_context;

public class MyTarget implements MyTargetInterface{

	@Override
	public void myTarget1() {
		System.out.println("myTarget1() is called ");
		
	}

	@Override
	public void myTarget2() {
		System.out.println("myTarget2() is called ");
		
	}

	@Override
	public void myTarget3() {
		System.out.println("myTarget3() is called ");
		
	}

}
