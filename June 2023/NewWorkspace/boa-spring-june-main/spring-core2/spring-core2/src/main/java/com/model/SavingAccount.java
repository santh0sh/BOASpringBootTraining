package com.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

 
public class SavingAccount implements InterestCalculator {
	 
	private int duration;
	 
	private double roi;

	 
	public SavingAccount(int duration, double roi) {
		super();
		this.duration = duration;
		this.roi = roi;
	}


	@Override
	public double calculate(double amount) {
		 
		return amount*roi/duration;
	}

}
