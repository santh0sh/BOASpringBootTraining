package com.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

public class FixedAccount implements InterestCalculator {

	private int duration;

	private double roi;

	public FixedAccount(int duration, double roi) {
		super();
		this.duration = duration;
		this.roi = roi;
	}

	@Override
	public double calculate(double amount) {

		return amount * roi / duration;
	}

}