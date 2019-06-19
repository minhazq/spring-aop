package org.spring.aop.test;

import java.lang.reflect.Proxy;

import org.spring.aop.MyInvocationHandler;
import org.spring.aop.MyTarget;
import org.spring.aop.MyTargetInterface;

public class MyClient {

	/*For creating Proxy we pass classloader[mostly the same classloader as origin class],interfaces,and the invocationHandler (pass the original target object in the invocation handler ). The original class must implement a interface ,
	only those method declared in interface get proxied and then we cast the proxy to the interface type .*/
	public static void main(String[] args) {
		
		MyTarget target = new MyTarget();
		
		MyTargetInterface proxyTarget = (MyTargetInterface) Proxy.newProxyInstance(MyClient.class.getClassLoader(), target.getClass().getInterfaces(),
				new MyInvocationHandler(target));
		
		//Advice is being called on every method which is declared in interface of my target , 
		proxyTarget.myTarget();
		proxyTarget.myTarget2();
		proxyTarget.myTarget3();

	}

}
