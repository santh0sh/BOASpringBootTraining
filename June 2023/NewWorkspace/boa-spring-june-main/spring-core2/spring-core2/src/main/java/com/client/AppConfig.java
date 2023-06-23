package com.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.model.FixedAccount;
import com.model.SavingAccount;
import com.service.AccountService;
 
@Configuration
public class AppConfig {
	@Bean
	public FixedAccount fda() {
		return new FixedAccount(5, 5.5);
	}
	@Bean
	public SavingAccount sa() {
		return new SavingAccount(6, 6.6);
	}
	@Bean
	public AccountService service() {
		return new AccountService(fda());
	}

}
