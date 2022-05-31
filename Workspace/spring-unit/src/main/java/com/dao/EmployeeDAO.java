package com.dao;

import org.springframework.stereotype.Repository;

import com.model.Employee;
import com.model.Employees;

@Repository
public class EmployeeDAO {

	private static Employees employees = new Employees();
	
	static {
		employees.getEmpList().add(new Employee("Admin",1,"admim@boa.com"));
		employees.getEmpList().add(new Employee("Developer",1,"dev@boa.com"));
		employees.getEmpList().add(new Employee("Tester",1,"test@boa.com"));
	}
	
	public Employees getEmployees() {
		return employees;
	}
	public void addEmployee(Employee emp) {
		employees.getEmpList().add(emp);
	}
}
