package com.boa.controller;

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

import com.boa.model.User;
import com.boa.service.UserService;

@RestController // Can be used only where all are returning @ResponseBody
@RequestMapping("/mainapp")
public class AppController {

	@Autowired
	UserService userService;
	

	@PostMapping("/login")
	public String validateLogin(@ModelAttribute User loginUser) {
		if (userService.validateLogin(loginUser)) {
			return "Login Success";
		}
		return "Login Failed";
	}

	
	@PostMapping("/register")
	public String registerUser(@ModelAttribute User registerUser) {
		return userService.registerUser(registerUser);
	}
	
	@PostMapping("/registerWithPost")
	public String registerUserWithPost(@RequestBody User registerUser) {
		return userService.registerUser(registerUser);
	}
	
	@GetMapping("/loadall")
	public List<User> loadUser(){
		return userService.loadusers();
	}
	
	@GetMapping("/finduser/{name}")
	public String findUser(@PathVariable String name){ //If only single variable no need of @PathVariable("name")
		return "User from service :- ".concat(userService.findUser(name).toString());
	}
	
	@DeleteMapping("/deleteuser/{name}")
	public String deleteUser(@PathVariable String name){ //If only single variable no need of @PathVariable("name")
		if(userService.deleteUser(name)) {
			return name + " user found and deleted";
		}
		return "User not found";
	}
	
	@PutMapping("/updateuser/{name}")
	public String updateUser(@PathVariable String name,@RequestBody User user){ //If only single variable no need of @PathVariable("name")
		return "Updated user from service :- ".concat(userService.updateUser(name,user).toString());
	}
}
