package com.test;


import com.model.FDAccountCalculator;
import com.model.InterestCalculator;
import com.model.SavingAccountInterestCalculator;
import com.service.CalculatorService;

import container.InterestContainer;

public class Test {
	public static void main(String arg[]){
	
		InterestContainer container=new InterestContainer();
		CalculatorService cs=(CalculatorService) container.getComponent("service");
		System.out.println(cs.service(10000));
		
		
	}
}
