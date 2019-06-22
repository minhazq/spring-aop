package org.spring.aop.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/*#############  DYNAMIC PROXY ##############*/

//InvocationHandler is comming from java.lang.reflect package
public class MyProxy implements InvocationHandler{

	private final MyTargetInterface target;
	
	//You must decleare this constructor so that you can grab the object
	// and the following invoke method you can call invoke by sending the target obj
	public MyProxy(MyTargetInterface target) {
		this.target = target;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("My Proxy is called");
		method.invoke(target, args);
		return null;
	}

}
