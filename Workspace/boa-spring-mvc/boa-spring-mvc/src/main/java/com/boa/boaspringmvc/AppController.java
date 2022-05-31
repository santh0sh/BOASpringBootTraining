package com.boa.boaspringmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boa.boaspringmvc.pojo.User;
import com.boa.boaspringmvc.service.UserService;

@Controller
@RequestMapping("/mainapp")
public class AppController {

	@Autowired
	UserService userService;
	

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String welcome() {
		return "welcome";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model) {
		model.addAttribute("loginUser", new User());
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public String validateLogin(@ModelAttribute User loginUser) {
		if (userService.validateLogin(loginUser)) {
			return "Login Success";
		}
		return "Login Failed";
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register(Model model) {
		model.addAttribute("registerUser", new User());
		return "register";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	@ResponseBody
	public String registerUser(@ModelAttribute User registerUser) {
		return userService.registerUser(registerUser);
	}
}
