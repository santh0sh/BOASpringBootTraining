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

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController // Can be used only where all are returning @ResponseBody
@RequestMapping("/mainapp")
public class AppController {

	@Autowired
	UserService userService;
	

	@PostMapping("/login")
	@ApiOperation(value = "Used to validate the user log in details", response = String.class)
	public String validateLogin(@ModelAttribute User loginUser) {
		if (userService.validateLogin(loginUser)) {
			return "Login Success";
		}
		return "Login Failed";
	}

	
	@PostMapping("/register")
	@ApiOperation(value = "Used to register the user",response = String.class)
	public String registerUser(@ModelAttribute User registerUser) {
		return userService.registerUser(registerUser);
	}
	
	@PostMapping("/registerWithPost")
	@ApiOperation(value = "Used to register the user with request body ",response = String.class)
	public String registerUserWithPost(@RequestBody User registerUser) {
		return userService.registerUser(registerUser);
	}
	
	@GetMapping("/loadall")
	@ApiOperation(value = "Load all the records", notes = "laod User Details",response = User.class)
	public List<User> loadUser(){
		return userService.loadusers();
	}
	
	@GetMapping("/finduser/{name}")
	@ApiOperation(value = "Find user with userName", notes = "Returns user object as Json",response = String.class)
	public String findUser( @ApiParam(value = "ID value to search specific user",required = true) @PathVariable String name){ //If only single variable no need of @PathVariable("name")
		return "User from service :- ".concat(userService.findUser(name).toString());
	}
	
	@DeleteMapping("/deleteuser/{name}")

	@ApiOperation(value = "Delete user with userName", notes = "Returns response message",response = String.class)
	public String deleteUser(@ApiParam(value = "ID value to delete specific user",required = true) @PathVariable String name){ //If only single variable no need of @PathVariable("name")
		if(userService.deleteUser(name)) {
			return name + " user found and deleted";
		}
		return "User not found";
	}
	
	@PutMapping("/updateuser/{name}")
	@ApiOperation(value = "used to update the User with username", notes = "Returns user object as Json",response = String.class)
	public String updateUser(@ApiParam(value = "ID value to update specific user",required = true) @PathVariable String name,@RequestBody User user){ //If only single variable no need of @PathVariable("name")
		return "Updated user from service :- ".concat(userService.updateUser(name,user).toString());
	}
}
