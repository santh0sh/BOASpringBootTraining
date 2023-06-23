package com.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.model.FixedAccount;

import ch.qos.logback.core.rolling.FixedWindowRollingPolicy;

@Configuration
@ComponentScan("com")
public class AppConfig {

	@Bean
	public FixedAccount fda() {
		return new FixedAccount(5,5.5);
	}
}
