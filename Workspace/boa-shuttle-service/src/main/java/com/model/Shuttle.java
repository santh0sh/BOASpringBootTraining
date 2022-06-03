package com.model;

public class Shuttle {

	public Shuttle() {
		// TODO Auto-generated constructor stub
	}

	private String vechicle;
	private String location;

	public String getVechicle() {
		return vechicle;
	}

	public void setVechicle(String vechicle) {
		this.vechicle = vechicle;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Shuttle [vechicle=" + vechicle + ", location=" + location + ", getVechicle()=" + getVechicle()
				+ ", getLocation()=" + getLocation() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public Shuttle(String vechicle, String location) {
		super();
		this.vechicle = vechicle;
		this.location = location;
	}

}
