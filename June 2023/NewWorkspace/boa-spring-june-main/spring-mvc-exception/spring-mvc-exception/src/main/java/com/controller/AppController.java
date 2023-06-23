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

import org.springframework.web.bind.annotation.RestController;

import com.dao.UserDao;
import com.model.User;
import com.model.Users;

@RestController
@RequestMapping("/mainapp")
public class AppController {

	@Autowired
	private UserDao dao;

	@GetMapping("/loadall")
	public Users loadUsers(
			@RequestHeader(name="X-COM-PERSIST", required = true)String header,
			@RequestHeader(name="X-COM-LOCATION", defaultValue = "ASIA")String location
			
			) {
		return dao.getAllUsers();
	}

	@PostMapping("/adduser")
	public ResponseEntity<Object> addUsers(@RequestBody User user) {
		Integer id = dao.getAllUsers().getUserList().size() + 1;
		user.setUid(id);
		dao.addUsers(user);
		return ResponseEntity.ok("User added");
	}

}
