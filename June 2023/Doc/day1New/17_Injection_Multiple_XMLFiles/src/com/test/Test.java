package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.model.InterestCalculator;
import com.service.CalculatorService;


public class Test {
	public static void main(String arg[])
	{
		String[] arr={"beans1.xml","beans2.xml","beans3.xml"};
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans1.xml");
		CalculatorService cs=(CalculatorService)ctx.getBean("service");
		System.out.println(cs.service(10000));
		
		
	
	}
}
