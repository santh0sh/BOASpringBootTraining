package com.factory;

import com.model.FDAccountCalculator;
import com.model.InterestCalculator;
import com.model.SavingAccountInterestCalculator;
 
public class InterestFactory {
	public static InterestCalculator create(char type){
		
		switch(type){
		case 's': return new SavingAccountInterestCalculator();
		case 'f': return new FDAccountCalculator();
		}
		return null;
	}
}
