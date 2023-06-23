package com.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.service.AccountService;

public class BankClient {

	public static void main(String[] args) {
//		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);		
				AccountService ac = (AccountService) ctx.getBean("service");
		System.out.println(ac.service(2323));
		ctx.close();
	}
			
}
