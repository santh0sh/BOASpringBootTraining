package com.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import lombok.Data;

@Configuration
@ConfigurationProperties("spring.datasource")
@Data
public class AppConfig {

	private String driverClassName;
	private String url;
	private String userName;
	private String password;

	@Bean
	@Profile("dev")
	public String devDB() {
		System.out.println("Connected to DEV DB");
		return "Dev connection established";
	}
	@Bean
	@Profile("test")
	public String testDB() {
		System.out.println("Connected to test DB");
		return "Dev connection established";
	}
	@Bean
	@Profile("prod")
	public String prodDB() {
		System.out.println("Connected to PROD DB");
		return "PROD connection established";
	}
}
