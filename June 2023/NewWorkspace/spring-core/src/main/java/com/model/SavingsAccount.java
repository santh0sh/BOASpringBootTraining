package com.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="sa")
public class SavingsAccount implements InterestCalculator {

	@Value(value = "8")
	private int duration;
	@Value(value = "7.5")
	private double roi;

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

	@Override
	public double calculate(double amount) {
		return amount*roi/duration;
	}

}
