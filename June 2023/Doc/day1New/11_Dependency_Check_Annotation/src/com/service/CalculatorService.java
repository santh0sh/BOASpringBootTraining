package com.service;

import org.springframework.beans.factory.annotation.Required;

import com.model.InterestCalculator;

public class CalculatorService {
	private InterestCalculator ic;
	
	public InterestCalculator getIc() {
		return ic;
	}
	@Required
	public void setIc(InterestCalculator ic) {
		this.ic = ic;
	}
	
	public CalculatorService(InterestCalculator ic){
		this.ic=ic;
	}
	public CalculatorService(){
		
	}
	public double service(double amt){
		return ic.calculate(amt);
	}
}
