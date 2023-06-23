package com.test;

import com.factory.InterestFactory;
import com.locator.InterestLocator;
import com.model.FDAccountCalculator;
import com.model.SavingAccountInterestCalculator;
import com.service.CalculatorService;

public class Test {
	public static void main(String arg[]){
	
		CalculatorService servicer=new CalculatorService(InterestLocator.lookup("s"));
		System.out.println("Interest for Savings Account for the amount 10000 [Current Month]: "+servicer.service(10000));
		
	
	}
}
