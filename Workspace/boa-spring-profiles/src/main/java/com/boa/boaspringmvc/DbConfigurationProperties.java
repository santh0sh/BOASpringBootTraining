package com.boa.boaspringmvc;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("spring.datasource")
public class DbConfigurationProperties {

	private String driverClassName;
	private String url;
	private String username;
	private String password;

	public String getDriverClassName() {
		return driverClassName;
	}

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Bean
	@Profile("dev")
	String devDBConnection() {
		System.out.println(driverClassName);
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
		return "Dev DB Connected";
	}
	
	@Bean
	@Profile("sit")
	String sitDBConnection() {
		System.out.println(driverClassName);
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
		return "TEST DB Connected";
	}
	
	@Bean
	@Profile("uat")
	String uatDBConnection() {
		System.out.println(driverClassName);
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
		return "TEST DB Connected";
	}

	@Bean
	@Profile("prod")
	String prodDBConnection() {
		System.out.println(driverClassName);
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
		return "PROD DB Connected";
	}

}