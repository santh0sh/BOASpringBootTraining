package com.delegate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class AppDelgate {
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	};

	@Autowired
	RestTemplate restTemplate;
	@HystrixCommand(fallbackMethod = "callOnFail")
	public String callUserApp() {

		return restTemplate.exchange("http://user-service/mainapp/loadall", HttpMethod.GET, null,
				new ParameterizedTypeReference<String>() {
				}).getBody();
	}
	
	public String callOnFail() {
		return "something went wrong.. ";
	}
}
