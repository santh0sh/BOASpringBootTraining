package com.model;

public class Payroll {

	public Payroll() {
		// TODO Auto-generated constructor stub
	}

	private String name;
	private String designation;
	private String salary;

	public Payroll(String name, String designation, String salary) {
		super();
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Payroll [name=" + name + ", designation=" + designation + ", salary=" + salary + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

}
