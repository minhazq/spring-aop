package org.spring.aop.spring_aop;

import org.springframework.stereotype.Component;

//This class is my regular business class that i want to apply advice
@Component // Spring can not inject Advice if it is not a spring bean
public class JdbcTemplateUserRepo {

	
	public User findUserById(Long id) {
		return null;
		
	}
}
