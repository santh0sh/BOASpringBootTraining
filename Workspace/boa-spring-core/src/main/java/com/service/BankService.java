package com.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import com.model.InterestCalculator;

//@Service
//@Component("service")
public class BankService {

	/*
	 * // @Autowired // @Qualifier("savingsAccount") InterestCalculator saIntCalc;
	 * 
	 * // @Autowired // @Qualifier("fixedAccount") InterestCalculator fdIntCalc;
	 * 
	 * // @Autowired // @Qualifier("currentAccount") InterestCalculator crntIntCalc;
	 * 
	 * // @Autowired // @Qualifier("businessAccount") // InterestCalculator
	 * bsnsIntCalc;
	 */	
	
	InterestCalculator ic;
	

	public BankService(InterestCalculator ic) {
		super();
		this.ic = ic;
	}
	
	public double calculateInterest(double amount) {
		return ic.calcluate(amount);
	}
	
	/*public double calculateSavingsInterest(double amount) {
		return saIntCalc.calcluate(amount);
	}
	
	public double calculateFixedInterest(double amount) {
		return fdIntCalc.calcluate(amount);
	}
	
	public double calculateBusinessAccInterest(double amount) {
		return bsnsIntCalc.calcluate(amount);
	}
	public double calculateCurrentAccInterest(double amount) {
		return crntIntCalc.calcluate(amount);
	}*/
	
	@PostConstruct
	public void init() {
		System.out.println("Init method Called");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("destroy method called");
	}
}
