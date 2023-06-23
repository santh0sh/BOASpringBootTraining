package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delegate.AppDelgate;

@RestController
@RequestMapping("/client")
public class AppController {
	
	@Autowired
	private AppDelgate appDelgate;

	@GetMapping("/loadall")
	public String loadUsers() {
		return appDelgate.callUserApp();
	}
}
