package com.pac2.common;

import org.springframework.validation.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pac2.*;

public class AppMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "context.xml" });
		Person person1 = (Person) context.getBean("personBean");
		PersonValidator p = new PersonValidator();
		BeanPropertyBindingResult v = new BeanPropertyBindingResult(person1,
				"Errors");
		p.validate(person1, v);
	}
}