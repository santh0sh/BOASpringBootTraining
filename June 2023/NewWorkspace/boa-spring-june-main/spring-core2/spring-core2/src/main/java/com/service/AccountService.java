package com.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.model.InterestCalculator;

public class AccountService {

	private InterestCalculator ic;

	public AccountService(InterestCalculator ic) {
		super();
		this.ic = ic;
	}

	public double service(double amount) {
		return ic.calculate(amount);
	}
@PostConstruct
	public void init() {
		System.out.println("service bean initialize");
	}
@PreDestroy
	public void destroy() {
		System.out.println("service bean destroyed");
	}

}
