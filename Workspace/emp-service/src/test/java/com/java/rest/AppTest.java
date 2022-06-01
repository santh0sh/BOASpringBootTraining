package com.java.rest;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.model.Employee;

import junit.framework.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class AppTest {

	@LocalServerPort
	int randomServerPort;
	
	@Test
	public void testGetEmpForMissingHeader() throws URISyntaxException {
		RestTemplate restTemplate = new RestTemplate();
		String baseURL="http://localhost:"+randomServerPort+"/loademp";
		
		URI uri = new URI(baseURL);
		HttpHeaders headers = new HttpHeaders();
		headers.set("X-COM-LOCATION", "ASIA");
		HttpEntity<Employee> entity = new HttpEntity<Employee>(null,headers);
		try {
			restTemplate.exchange(uri, HttpMethod.GET,entity,String.class);
			Assert.fail();
		} catch (HttpClientErrorException e) {
			Assert.assertEquals(400, e.getRawStatusCode());
		}
	}
	
	@Test
	public void testAddUserForSuccess() throws URISyntaxException {
		RestTemplate restTemplate = new RestTemplate();
		String baseURL="http://localhost:"+randomServerPort+"/adduser";
		
		URI uri = new URI(baseURL);
		Employee employee = new Employee("admin",3,"admin@boa.com");
		HttpEntity<Employee> entity = new HttpEntity<Employee>(employee);
		ResponseEntity<String> request = restTemplate.postForEntity(uri, entity, String.class);
		Assert.assertEquals(200, request.getStatusCodeValue());
	}
	
	@Test
	public void testAddUserForFailure() throws URISyntaxException {
		RestTemplate restTemplate = new RestTemplate();
		String baseURL="http://localhost:"+randomServerPort+"/adduser";
		
		URI uri = new URI(baseURL);
		Employee employee = null;
		try {
			HttpEntity<Employee> entity = new HttpEntity<Employee>(employee);
			ResponseEntity<String> request = restTemplate.postForEntity(uri, entity, String.class);
			Assert.assertEquals(500, request.getStatusCodeValue());
		}catch(Exception e) {
			Assert.fail();
		}
	}

}
