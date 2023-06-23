package com.model;

public class SavingAccountInterestCalculator implements InterestCalculator {

	private double roi=3.5;
	private int duration;
	@Override
	public double calculate(double amt) {
		// TODO Auto-generated method stub
		return (roi/100.0)*amt/duration;
	}
	public SavingAccountInterestCalculator() {
		// TODO Auto-generated constructor stub
	}
	public SavingAccountInterestCalculator(double roi, int duration)
	{
		this.roi=roi;
		this.duration=duration;
	}
	
}
