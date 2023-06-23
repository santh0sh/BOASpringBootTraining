package com.model;

public class SavingAccountInterestCalculator implements InterestCalculator {

	private double roi;
	private int duration;
	
	public double calculate(double amt) {
		
		return (roi/100.0)*amt/duration;
	}
	public void setRoi(double roi) {
		this.roi = roi;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	
}
