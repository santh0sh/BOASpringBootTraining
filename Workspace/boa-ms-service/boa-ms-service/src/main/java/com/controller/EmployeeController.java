package com.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Employee;

@RestController
public class EmployeeController {

	@RequestMapping("/loadsingle")
	public Employee loadSingle() {

		Employee e = new Employee("Admin", "admin@admin.co", "madras");
		return e;
	}
	
	private static Map<String, List<Employee>> empdb = new HashMap<String, List<Employee>>();

	static {
		empdb = new HashMap<String, List<Employee>>();

		List<Employee> lst = new ArrayList<Employee>();
		Employee emp = new Employee("sudeep", "sudeep@mail.com", "mumbai");
		lst.add(emp);

		emp = new Employee("suresh", "suresh@mail.com", "madurai");
		lst.add(emp);
		empdb.put("banking", lst);
		lst = new ArrayList<Employee>();
		emp = new Employee("rekha", "rekha@mail.com", "chennai");
		lst.add(emp);
		emp = new Employee("manisha", "manisha@mail.com", "hyderabad");
		lst.add(emp);
		empdb.put("healthcare", lst);
	}

	@GetMapping("/loademp/{pname}")
	public List<Employee> loadEmployee(@PathVariable String pname) {

		List<Employee> emplist = empdb.get(pname);
		if (emplist == null) {
			emplist = new ArrayList<Employee>();
			Employee e = new Employee("NA", "NA", "Not Found");
			emplist.add(e);
		}
		return emplist;
	}

}
