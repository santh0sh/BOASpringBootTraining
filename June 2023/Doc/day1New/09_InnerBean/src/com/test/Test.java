package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.model.InterestCalculator;
import com.service.CalculatorService;


public class Test {
	public static void main(String arg[]){
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		CalculatorService cs=(CalculatorService)ctx.getBean("service");
		System.out.println(cs.service(10000));
		
		
	
	
	}
}
