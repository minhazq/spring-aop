package org.spring.aop.spring_aop.with_context;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {

	@Autowired
	private ApplicationContext context;
	
	@Bean
	public ProxyFactoryBean getMyTarget() {
		ProxyFactoryBean p = new ProxyFactoryBean();
		p.setTarget(context.getBean(MyTarget.class));
		p.addAdvice(context.getBean(MyAspectBeforeMethod.class));
		return p;
	}
	
}
