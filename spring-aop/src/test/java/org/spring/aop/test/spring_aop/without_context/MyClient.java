package org.spring.aop.test.spring_aop.without_context;

import org.spring.aop.spring_aop.without_context.MyAspect;
import org.spring.aop.spring_aop.without_context.MyTarget;
import org.spring.aop.spring_aop.without_context.MyTargetInterface;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.framework.ProxyFactoryBean;

//Only Spring-aop dependency added

//this one is the client using spring AOP without aspectJ framework
public class MyClient {

	public static void main(String[] args) {
		
		//This is how to create a proxy factory object where you manufacture proxy object
		ProxyFactory proxyFactory = new ProxyFactory(new MyTarget());
		proxyFactory.addInterface(MyTargetInterface.class);
		proxyFactory.addAdvice(new MyAspect());
		
		//Here it is weaving
		MyTargetInterface myTarget = (MyTargetInterface) proxyFactory.getProxy();
		
		//Calling proxy method
		myTarget.myTarget1();
		myTarget.myTarget2();
		myTarget.myTarget3();
		
		//Another way of doing it
		System.out.println("##########");
		ProxyFactoryBean proxyFactoryBean = new ProxyFactoryBean();
		proxyFactoryBean.setTarget(new MyTarget());
		proxyFactoryBean.addAdvice(new MyAspect());
		
		MyTargetInterface myTarget2 = (MyTargetInterface) proxyFactoryBean.getObject();
		myTarget2.myTarget1();
		myTarget2.myTarget2();
		myTarget2.myTarget3();
		

	}

}
