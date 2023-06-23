package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.User;
import com.model.Users;
import com.service.UserService;
 
@RestController
@RequestMapping("/mainapp")
public class AppController {

	@Autowired
	private UserService service;

	@GetMapping("/loadallusers")
	
	public Users loadAll(
		//@RequestHeader(name="X-COM-PERSIST", required = true)String header,	
		//@RequestHeader(name="X-COM-LOCATION", defaultValue = "ASIA")String loc	
			) {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return service.getList();
		
		
	}
	@PostMapping("/adduser")
	public ResponseEntity<Object> addUser(@RequestBody User user){
		service.addUser(user);
		return ResponseEntity.ok("User Added");
	}
	
	@GetMapping("/loaduser/{name}")
	public User loadUser(@PathVariable String name) {
		return service.getUser(name);
		
	}
	
}
