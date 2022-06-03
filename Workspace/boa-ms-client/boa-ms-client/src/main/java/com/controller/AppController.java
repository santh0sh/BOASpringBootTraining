package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.delegate.AppDelegate;
import com.delegate.Employee;
import com.example.boamsclient.FeignDelegate;

@RestController
public class AppController {

	@Autowired
	private AppDelegate appDelegate;
	
	@Autowired
	private FeignDelegate fdDelegate;
	
	@GetMapping("/loademp/{pname}")
	private String loadEmp(@PathVariable String pname) {
		return appDelegate.loadEmp(pname);
	}
	
	@GetMapping("/loadshuttle/{city}")
	private String loadShuttle(@PathVariable String city) {
		return appDelegate.loadShuttle(city);
	}
	

	@GetMapping("/getPayDetails/{desg}")
	private String getPayDetails(@PathVariable String desg) {
		return appDelegate.getPayDetails(desg);
	}
	
	@GetMapping("/loadsingle")
	private Employee loadsingleemp() {
		return fdDelegate.getData();
	}
	
	
	
	
	/*
	 * @PostMapping("/adduser") public ResponseEntity<Object> addUser(@RequestBody
	 * Employee employee) {
	 * employee.setId(dao.getEmployees().getEmpList().size()+1); //Adding new id
	 * incremented by current size; dao.addEmployee(employee); return
	 * ResponseEntity.ok("User Created"); }
	 */
}
