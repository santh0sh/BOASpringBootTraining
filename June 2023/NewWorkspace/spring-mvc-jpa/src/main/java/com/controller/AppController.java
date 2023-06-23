package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.User;
import com.service.UserService;

@RestController
@RequestMapping(path="/mainapp")
public class AppController {
	@Autowired
	private UserService service;
	

	
	//@RequestMapping(path="/login", method=RequestMethod.POST)
	//@ResponseBody()
	@PostMapping("/login")
	public String loginValid(@ModelAttribute User user) {
		if(service.loginValid(user)) {
			return "Login Successful";
		}
		return "Login Failed";
	}
	
	//@RequestMapping(path="/register", method=RequestMethod.POST)
	//@ResponseBody()
	@PostMapping("/register")
	public String registration(@ModelAttribute User user) {
		return service.registration(user);
	}
	
	@GetMapping("/loadall")
	public List<User> loadUser() {
		return service.loadUser();
	}
	
	@GetMapping("/finduser/{uname}")
	public String loadUser(@PathVariable("uname")String name) {
		if(service.findUser(name)) {
			return name + " found";
		}
		return "User not found";
	}
	
	@DeleteMapping("/deleteuser/{uname}")
	public String deleteUser(@PathVariable("uname")String name) {
		if(service.deleteUser(name)) {
			return name + " deleted";
		}
		return "User not deleted";
	}
	
	@PutMapping("/updateuser/{uname}")
	public String updateUser(@PathVariable("uname")String name, @RequestBody User user) {
		service.updateUser(name, user);
		return "Find and updated";
	}
	
	
}
