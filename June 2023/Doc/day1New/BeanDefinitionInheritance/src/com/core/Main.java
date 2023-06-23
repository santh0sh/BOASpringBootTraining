package com.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Car;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Beans.xml");
		Car car = (Car) context.getBean("car");

		System.out.println("No. of Tyres : " + car.getTyreCount());
		System.out.println("Contains Airbag : " + car.isAirBag());
		
		
	}

}
