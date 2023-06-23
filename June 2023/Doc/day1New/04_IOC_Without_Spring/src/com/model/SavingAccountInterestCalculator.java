package com.model;

public class SavingAccountInterestCalculator implements InterestCalculator {

	private double roi=3.5;
	@Override
	public double calculate(double amt) {
		// TODO Auto-generated method stub
		return (roi/100.0)*amt/12.0;
	}

}
