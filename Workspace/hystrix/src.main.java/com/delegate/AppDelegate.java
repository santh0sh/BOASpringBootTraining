package com.delegate;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@Service
public class AppDelegate {

	RestTemplate restTemplate = new RestTemplate();

	@HystrixCommand(fallbackMethod = "callOnFailOrDelay", commandProperties = {
			@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1100") })
	public String loadEmp() {
		String response = restTemplate.exchange("http://localhost:8080/mainapp/loadall", HttpMethod.GET, null,
				new ParameterizedTypeReference<String>() {
				}).getBody();
		return response;
	}

	public String callOnFailOrDelay() {
		return "Internal Server Error";
	}

}
