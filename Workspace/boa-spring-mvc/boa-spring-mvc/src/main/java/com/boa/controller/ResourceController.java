package com.boa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boa.model.User;

@Controller
@RequestMapping("/mainapp")
public class ResourceController {

	@GetMapping("/welcome")
	public String welcome() {
		return "welcome";
	}

	@GetMapping("/login")
	public String login(Model model) {
		model.addAttribute("loginUser", new User());
		return "login";
	}
	
	@GetMapping("/register")
	public String register(Model model) {
		model.addAttribute("registerUser", new User());
		return "register";
	}
}
