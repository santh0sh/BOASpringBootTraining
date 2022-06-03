package com.example.boamsclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.delegate.Employee;

@FeignClient("emp-service")
public interface FeignDelegate {

	@RequestMapping(method=RequestMethod.GET,value="/loadsingle")
	public Employee getData();
}
