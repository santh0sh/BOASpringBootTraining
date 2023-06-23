package com.model;

 
 
public class FDAccountCalculator implements InterestCalculator {
	private double roi;
	private int duration;
	@Override
	public double calculate(double amt) {
		// TODO Auto-generated method stub
		return roi/100.0*amt*duration;
	}
	
	public FDAccountCalculator() {
		// TODO Auto-generated constructor stub
	}
	
	public FDAccountCalculator(double roi, int duration)
	{
		this.roi=roi;
		this.duration=duration;
	}

}
