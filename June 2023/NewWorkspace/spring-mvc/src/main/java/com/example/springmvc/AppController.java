package com.example.springmvc;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/mainapp")
public class AppController {

	ArrayList<User> al = new ArrayList<User>();
	@Autowired
	UserService service;

	@RequestMapping(path = "/welcome", method = RequestMethod.GET)
	@ResponseBody()
	public String sayWelcome() {
		return "Welcome to Spring MVC";
	}


	@RequestMapping(path = "/login", method = RequestMethod.POST)
	@ResponseBody
	public String loginValid(@ModelAttribute User user) {
		if (service.isValid(user)) {
			return "login successfull";
		}
		return "login failed";
	}


	@RequestMapping(path = "/register", method = RequestMethod.POST)
	@ResponseBody
	public String registerUser(@ModelAttribute User user) {
		al.add(user);
		System.out.println(al);
		return "user registered";
	}

}