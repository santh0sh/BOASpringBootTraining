package com.test;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;


import com.model.InterestCalculator;
import com.service.CalculatorService;


public class Test {
	public static void main(String arg[]){
		
		//ConfigurableListableBeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
		ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		CalculatorService cs1=(CalculatorService)ctx.getBean("service");
		System.out.println(cs1.service(10000));
		//CalculatorService cs2=(CalculatorService)ctx.getBean("service");
		ctx.close();
		
		
	}}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//factory.destroySingletons();
 
		//Runtime.runFinalizersOnExit(true); // to run the finalize method when the object is garbage collected
		
		//System.out.println("calling nothing2"+cs);

		//factory.destroyBean("service",cs);// for destroying a single bean object
		////System.out.println("it is destroyed"+cs);
		//factory.destroySingletons();// for destroying all the bean objects in the container
		//System.out.println("it is destroyed"+cs);

		
	
	