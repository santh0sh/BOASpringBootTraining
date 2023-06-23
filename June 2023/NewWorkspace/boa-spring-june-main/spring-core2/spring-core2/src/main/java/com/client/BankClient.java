package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.AccountService;

public class BankClient {
	public static void main(String[] args) {
		// initialize the container with all the classes inside XML ,eagerly -> lazy
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);
		//access the service
		AccountService ac=(AccountService)ctx.getBean("service");
		
		System.out.println(ac.service(4456));
		
		ctx.close();
		
         
	}

}
