package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.model.InterestCalculator;
@Service(value="service")
public class CalculatorService {
	@Autowired
	@Qualifier(value="fda")
	private InterestCalculator ic;
	
	public InterestCalculator getIc() {
		return ic;
	}
	public void setIc(InterestCalculator ic) {
		this.ic = ic;
	}
	
	
	public double service(double amt){
		return ic.calculate(amt);
	}
	public CalculatorService() {
		System.out.println("ser initialized");
	}
	
}
