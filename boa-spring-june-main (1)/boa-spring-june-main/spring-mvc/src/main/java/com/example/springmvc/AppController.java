package com.example.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/mainapp")
public class AppController {
	
	@RequestMapping(path = "/welcome",method = RequestMethod.GET)
	@ResponseBody()
	public String sayWelcome() {
		return "Welcome to Spring MVC";
	}
	
	@RequestMapping(path = "/login",method = RequestMethod.GET)
	@ResponseBody()
	public String login() {
		return "Welcome to login";
	}
	
	@RequestMapping(path = "/register",method = RequestMethod.GET)
	@ResponseBody()
	public String register() {
		return "Welcome to register";
	}

}
