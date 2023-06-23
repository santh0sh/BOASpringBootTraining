package com.model;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;
@Component(value="fda")
public class FDAccountCalculator implements InterestCalculator {
	private double roi;
	private int duration;
	@Override
	public double calculate(double amt) {
		// TODO Auto-generated method stub
		return roi/100.0*amt*duration;
	}
	//@Required
	public void setRoi(double roi) {
		this.roi = roi;
	}
	//@Required
	public void setDuration(int duration) {
		this.duration = duration;
	}

	public FDAccountCalculator() {
		 System.out.println("fda initialize");
	}
	

}
