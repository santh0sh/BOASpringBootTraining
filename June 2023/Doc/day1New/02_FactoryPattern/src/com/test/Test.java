package com.test;

import com.factory.InterestFactory;
import com.model.FDAccountCalculator;
import com.model.SavingAccountInterestCalculator;
import com.service.CalculatorService;

public class Test {
	public static void main(String arg[]){
	/*	CalculatorService servicer=new CalculatorService(new SavingAccountInterestCalculator());
		System.out.println("Interest for Savings Account for the amount 10000 [Current Month]: "+servicer.service(10000));
		servicer=new CalculatorService(new FDAccountCalculator());
		System.out.println("Interest for FD Account for the amount 10000 for 3 years: "+servicer.service(10000));*/
		
		CalculatorService servicer=new CalculatorService(InterestFactory.create('s'));
		System.out.println("Interest for Savings Account for the amount 10000 [Current Month]: "+servicer.service(10000));
		servicer=new CalculatorService(InterestFactory.create('f'));
		System.out.println("Interest for FD Account for the amount 10000 for 3 years: "+servicer.service(10000));
		
	}
}
