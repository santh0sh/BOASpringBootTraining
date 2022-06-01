package com.delegate;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AppDelegate {

	public AppDelegate() {
		// TODO Auto-generated constructor stub
	}

	RestTemplate restTemplate  = new RestTemplate();
	public String loadEmp() {
		String response = restTemplate.exchange("http://localhost:8080/mainapp/loadall", HttpMethod.GET,null,
				new ParameterizedTypeReference<String>() {
				}).getBody();
			return response;
	}
}
