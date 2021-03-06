package com.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

//@Component
//@Lazy
public class FixedAccount implements InterestCalculator {

	@Value(value = "4")
	private int duration;
	@Value(value = "4.5")
	private double roi;
	
	public double calcluate(double amount) {
		return amount*roi/duration;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public double getRoi() {
		return roi;
	}

	public void setRoi(double roi) {
		this.roi = roi;
	}
	
	public FixedAccount() {
		System.out.println("Fixed Account initiated");
	}

}
