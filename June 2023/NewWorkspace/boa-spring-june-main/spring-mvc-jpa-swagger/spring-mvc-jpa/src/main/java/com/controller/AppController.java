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

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/mainapp")
public class AppController {

	@Autowired
	private UserService service;

	@PostMapping("/login")
	public String loginValid(@ModelAttribute User user) {
		if (service.loginValid(user)) {
			return "login successfull";
		}
		return "login failed";
	}

	@PostMapping("/register")
	public String registerUser(@ModelAttribute User user) {
		service.addUser(user);
		return "user registered";
	}

	@GetMapping("/loadall")
	public List<User> loadUsers() {
		return service.loadUsers();
	}

	@GetMapping("/finduser/{uname}")
	@ApiOperation(value = "find user by unique id/name",notes = "make sure the user id/name does exist",
	response = User.class
			)
	
	public String findUser(@ApiParam(value="id of user expected",required = true) @PathVariable("uname") String name) {
		if (service.findUser(name)) {
			return name + " found";
		}
		return "user not found";
	}

	@DeleteMapping("/deleteuser/{uname}")
	public String deleteUser(@PathVariable("uname") String name) {
		if (service.deleteUser(name)) {
			return name + " found and deleted";
		}
		return "user not found";
	}
	@PutMapping("/updateuser/{uname}")
	public String updateUser(@PathVariable("uname") String name,@RequestBody User user) {
		 service.updateUser(name,user);   
			return name + " found and updated";
		
		 
	}
}
