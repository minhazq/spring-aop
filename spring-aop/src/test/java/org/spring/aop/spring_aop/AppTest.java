package org.spring.aop.spring_aop;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=AppConfig.class)
public class AppTest {
  
	@Autowired
	JdbcTemplateUserRepo userRepo;
	
	@Test
	public void test1() {
		userRepo.findUserById((long) 12.00);
	}
}
