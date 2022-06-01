package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delegate.AppDelegate;

@RestController
public class AppController {

	@Autowired
	private AppDelegate appDelegate;
	
	@GetMapping("/loademp")
	private String loadEmp() {
		return appDelegate.loadEmp();
	}
	
	/*
	 * @PostMapping("/adduser") public ResponseEntity<Object> addUser(@RequestBody
	 * Employee employee) {
	 * employee.setId(dao.getEmployees().getEmpList().size()+1); //Adding new id
	 * incremented by current size; dao.addEmployee(employee); return
	 * ResponseEntity.ok("User Created"); }
	 */
}
