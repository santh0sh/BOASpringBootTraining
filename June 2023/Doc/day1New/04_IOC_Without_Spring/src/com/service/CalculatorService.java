package com.service;

import com.model.InterestCalculator;

public class CalculatorService {
	private InterestCalculator ic;
	
	public InterestCalculator getIc() {
		return ic;
	}
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
