package org.spring.aop.proxy.test;

import java.lang.reflect.Proxy;
import org.spring.aop.proxy.MyProxy;
import org.spring.aop.proxy.MyTarget;
import org.spring.aop.proxy.MyTargetInterface;

public class DynamicProxyTest {

	
	public static void  main(String...args) {
		
		MyTargetInterface targetProxy =  (MyTargetInterface) Proxy.newProxyInstance(MyTargetInterface.class.getClassLoader(), new Class[] {MyTargetInterface.class}, new MyProxy(new MyTarget()));
	
	    targetProxy.method1();
	    targetProxy.method2();
	    targetProxy.method3();
	    
	}
}
