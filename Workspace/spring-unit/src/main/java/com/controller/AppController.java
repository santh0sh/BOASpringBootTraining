package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.dao.EmployeeDAO;
import com.model.Employee;
import com.model.Employees;

@RestController
public class AppController {

	@Autowired
	private EmployeeDAO dao;
	
	@GetMapping("/loademp")
	private Employees loadEmp(
			@RequestHeader(name="X-COM-PERSIST",required = true) String persist,
			@RequestHeader(name="X-COM-LOCATION",defaultValue="Asia") String loc
			) {
		System.out.println(persist);
		return dao.getEmployees();
	}
	
	@PostMapping("/adduser")
	public ResponseEntity<Object>  addUser(@RequestBody Employee employee) {
		employee.setId(dao.getEmployees().getEmpList().size()+1); //Adding new id incremented by current size;
		dao.addEmployee(employee);
		return ResponseEntity.ok("User Created");
	}
}
