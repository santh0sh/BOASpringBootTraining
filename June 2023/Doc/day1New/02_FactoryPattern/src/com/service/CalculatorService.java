package com.service;

import com.model.InterestCalculator;

public class CalculatorService {
	private InterestCalculator ic;
	public CalculatorService(InterestCalculator ic){
		this.ic=ic;
	}
	public double service(double amt){
		return ic.calculate(amt);
	}
}
