package com.example.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/mainapp")
public class RestController {

	@RequestMapping(path = "/login", method = RequestMethod.GET)

	public String login() {
		return "login";
	}

	@RequestMapping(path = "/register", method = RequestMethod.GET)

	public String register() {
		return "register";
	}

}