package com.model;

public class Employee {

	private String name;
	private int id;
	private String email;
	
	public Employee() {
		super();
	}
	public Employee(String name, int id, String email) {
		super();
		this.name = name;
		this.id = id;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", email=" + email + "]";
	}
	
}
