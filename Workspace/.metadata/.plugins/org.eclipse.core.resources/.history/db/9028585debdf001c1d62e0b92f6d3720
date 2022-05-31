package com.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.model.FixedAccount;
import com.model.SavingsAccount;
import com.service.BankService;

@Configuration
//@ComponentScan("com")
public class AppConfig {

	@Bean
	public FixedAccount fxdAcct() {
		return new FixedAccount();
	}
	@Bean
	public SavingsAccount svngsAcct() {
		return new SavingsAccount();
	}
	@Bean
	public BankService savingsService() {
		return new BankService(svngsAcct());
	}
	
}
