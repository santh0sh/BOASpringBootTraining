package com.delegate;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AppDelgate {

	public RestTemplate restTemplate = new RestTemplate();
	
	public String callUserApp() {
	
		return restTemplate.exchange("http://localhost:8090/mainapp/loadall", HttpMethod.GET,null,
							new ParameterizedTypeReference<String>() {
							}).getBody();
	}
}
