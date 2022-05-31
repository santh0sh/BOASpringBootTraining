package com.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//@Component
//@Qualifier("businessAccount")
public class BusinessAccount implements InterestCalculator {

	@Value(value = "6")
	private int duration;
	@Value(value = "2.5")
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

}
