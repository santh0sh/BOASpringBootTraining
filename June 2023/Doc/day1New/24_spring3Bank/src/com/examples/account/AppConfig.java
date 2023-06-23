package com.examples.account;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.examples.account.repository.AccountRepository;
import com.examples.account.repository.InMemoryAccountRepository;
import com.examples.account.service.TransferService;
import com.examples.account.service.TransferServiceImpl;

@Configuration
//Indicates that a class declares one or more Bean methods and may be processed by the Spring container to generate bean definitions and service requests for those beans at runtime. 


public class AppConfig {

	

	@Bean
	public AccountRepository accountRepository() {
		return new InMemoryAccountRepository();
	}
	@Bean
	//Indicates that a method produces a bean to be managed by the Spring container
	public TransferService transferService() {
		return new TransferServiceImpl(accountRepository());
	}
	
}
