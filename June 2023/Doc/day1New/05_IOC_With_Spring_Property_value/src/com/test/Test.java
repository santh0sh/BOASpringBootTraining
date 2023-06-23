package com.test;

import org.springframework.beans.factory.xml.*;
import org.springframework.beans.factory.*;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;


import com.model.InterestCalculator;
import com.service.AppConfig;
import com.service.CalculatorService;


public class Test {
	public static void main(String arg[]){
		
	ApplicationContext  ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		//ConfigurableApplicationContext 
 		/*XmlBeanFactory ctx = new XmlBeanFactory
                 (new ClassPathResource("beans.xml"));*/
		CalculatorService cs=(CalculatorService)ctx.getBean("service");
		System.out.println(cs.service(10000));

		
		
	
	}
}
