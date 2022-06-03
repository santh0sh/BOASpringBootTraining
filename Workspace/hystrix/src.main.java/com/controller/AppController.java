package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delegate.AppDelegate;

@RestController
public class AppController {

	@Autowired
	private AppDelegate appDelegate;
	
	
	@GetMapping("/loademp")
	private String loadEmp() {
		return appDelegate.loadEmp();
	}
	
}
