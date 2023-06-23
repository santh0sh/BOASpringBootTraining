package com.examples.account;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.examples.account.repository.AccountRepository;
import com.examples.account.repository.InMemoryAccountRepository;
import com.examples.account.service.TransferService;
import com.examples.account.service.TransferServiceImpl;

@Configuration
@ComponentScan(basePackages="com")

//Indicates that a class declares one or more Bean methods and may be processed by the Spring container to generate bean definitions and service requests for those beans at runtime. 


public class AppConfig {

	

	 
	
}
