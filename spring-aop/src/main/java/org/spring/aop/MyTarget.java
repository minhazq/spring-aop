package org.spring.aop;

//This is my simple business class. Here i will decleare all business methods.
//Consider myTarget is my business method. You must decleare interface
//Because Dynamic JDK proxy works only with interface.
public class MyTarget implements MyTargetInterface{

	@Override
	public void myTarget() {
		System.out.println("This is myTarget Method");
		
	}

	@Override
	public void myTarget2() {
		System.out.println("This is myTarget Method2 ");
		
	}

	@Override
	public void myTarget3() {
		System.out.println("This is myTarget Method3 ");
		
	}

}
