package com.model;

public class FDAccountCalculator implements InterestCalculator {
	private double roi=8.0;
	private int duration=3;
	@Override
	public double calculate(double amt) {
		// TODO Auto-generated method stub
		return roi/100.0*amt*duration;
	}

}
