package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping(path="/mainapp")
public class RestController {
	
	//@RequestMapping(path="/login", method=RequestMethod.GET)
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	
	//@RequestMapping(path="/register", method=RequestMethod.GET)
	@GetMapping("/register")
	public String register() {
		return "register";
	}
	
}
