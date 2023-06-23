package com.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;


import com.model.InterestCalculator;
import com.service.CalculatorService;


public class Test {
	public static void main(String arg[]){
		//XmlBeanFactory ctx = new XmlBeanFactory(new FileSystemResource("beans.xml"));

		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		CalculatorService cs=(CalculatorService)ctx.getBean("service");
		System.out.println(cs.service(10000));
		
	
	}
}
