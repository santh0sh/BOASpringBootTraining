package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.model.FDAccountCalculator;
import com.model.InterestCalculator;
import com.model.SavingAccountInterestCalculator;

public class CalculatorService {
	private InterestCalculator ic;
	
	@Autowired
 	public CalculatorService(InterestCalculator sc){
		ic=sc;
	}
	
	/*public InterestCalculator getIc() {
		return ic;
	}
 	 
	public void setIc(InterestCalculator ic) {
		this.ic = ic;
	}
	
	*/
	 
	public double service(double amt){
		return ic.calculate(amt);
	}
}
