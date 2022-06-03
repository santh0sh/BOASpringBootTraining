package com.boa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.boa.model.User;

@Controller
public class TemplateAppController {

	public TemplateAppController() {
	}

	@GetMapping("/welcome")
	public String showWelcome() {
		return "welcome";
	}
	
	@PostMapping("/register")
	public ModelAndView register(@ModelAttribute User user) {
		ModelAndView mv =new ModelAndView();
		mv.setViewName("data");
		mv.addObject("user",user);
		return mv;
	}
}
