package com.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import com.model.InterestCalculator;

public class CalculatorService {
	private InterestCalculator ic;
	
	public InterestCalculator getIc() {
		return ic;
	}
	public void setIc(InterestCalculator ic) {
		this.ic = ic;
	}
	public CalculatorService(InterestCalculator ic){
		this.ic=ic;
	}
	public CalculatorService(){
		
	}
	public double service(double amt){
		return ic.calculate(amt);
	}
	@PostConstruct
	public void initDemo()
	{
		System.out.println("Bean Initialized");
	}
	@PreDestroy
	public void destroyDemo()
	{
		System.out.println("Bean Destroyed");
	}
	
	
	
}
