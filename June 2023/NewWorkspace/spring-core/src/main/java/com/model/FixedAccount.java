package com.model;

public class FixedAccount implements InterestCalculator {

	private int duration;
	private double roi;

	public FixedAccount(int duration, double roi) {
		this.duration = duration;
		this.roi = roi;
	}

	@Override
	public double calculate(double amount) {
		return amount*roi/duration;
	}

}
