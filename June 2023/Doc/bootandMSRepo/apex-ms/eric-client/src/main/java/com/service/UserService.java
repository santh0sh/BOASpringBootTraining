package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

 
@Service
public class UserService {
	
	
	@Autowired
	RestTemplate restTemplate;
	@Bean
	@LoadBalanced
	public RestTemplate template() {
		return new RestTemplate();
	}
	@HystrixCommand(fallbackMethod = "callOnFail",commandProperties = {
			@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "2000")
	})
	public String loadUsersFromApp() {
		
		String response= restTemplate.exchange(
				"http://zuul-service/apexonemp/"
				,HttpMethod.GET
				,null
				,new ParameterizedTypeReference<String>() {
				}).getBody();
		return response;
				
	}
	
	@HystrixCommand(fallbackMethod = "callOnFail",commandProperties = {
			@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "2000")
	})
	public String loadUsersFromAppDB() {
		
		String response= restTemplate.exchange(
				"http://user-service-jpa/promain/loadpro"
				,HttpMethod.GET
				,null
				,new ParameterizedTypeReference<String>() {
				}).getBody();
		return response;
				
	}
	
	
	
	
	
	private String callOnFail() {
		return "Somethinng went Wrong.... Please try after sometime....";
	}

	
	
	
	

}
