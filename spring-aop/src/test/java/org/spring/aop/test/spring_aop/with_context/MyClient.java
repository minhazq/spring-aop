package org.spring.aop.test.spring_aop.with_context;
import org.spring.aop.spring_aop.with_context.AppConfig;
import org.spring.aop.spring_aop.with_context.MyTargetInterface;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyClient {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		MyTargetInterface target = (MyTargetInterface) context.getBean("getMyTarget");
		target.method1();
		target.method2();
		target.method3();



	}
}
