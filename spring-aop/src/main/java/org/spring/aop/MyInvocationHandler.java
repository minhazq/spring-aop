package org.spring.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


//This is my Aspect class. I will declare my advice method here ( Advice means action).
//Each advice method will be executed after the business method is executed.
public class MyInvocationHandler implements InvocationHandler{

	private Object target;
	
	public MyInvocationHandler(Object target) {
		this.target = target;
	}
	
	public Object getTarget(){
		return target;
	}
	
	public void setTarget(Object target){
		this.target = target;
	}
	
	//This is my Advice. This advice will be called after target method is being called.
	//So you can consider it as @After advice.
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = method.invoke(target, args);
		System.out.println("invoke() is called.This is my Aspect method");
		return result;
	}

}
