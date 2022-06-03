package com.delegate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AppDelegate {

	@Autowired
	RestTemplate restTemplate ;
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	public String loadEmp(String pname) {
		String response = restTemplate.exchange("http://emp-service/loademp/{pname}", HttpMethod.GET,null,
				new ParameterizedTypeReference<String>() {
				},pname).getBody();
			return response;
	}
	
	public String loadShuttle(String city) {
		String response = restTemplate.exchange("http://shuttle-service/loadshuttle/{city}", HttpMethod.GET,null,
				new ParameterizedTypeReference<String>() {
				},city).getBody();
			return response;
	}
	
	public String getPayDetails(String desg) {
		String response = restTemplate.exchange("http://payroll-service/getpaydetails/{desg}", HttpMethod.GET,null,
				new ParameterizedTypeReference<String>() {
				},desg).getBody();
			return response;
	}
	
}
