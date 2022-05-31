package com.boa.model;

public class User {

	private String uname;
	private String pwd;
	private String email;
	private String city;
	
	public User(String uname, String pwd, String email, String city) {
		super();
		this.uname = uname;
		this.pwd = pwd;
		this.email = email;
		this.city = city;
	}

	public User(String uname, String pwd) {
		super();
		this.uname = uname;
		this.pwd = pwd;
	}
	public User(){
		
	}
	public User(User user){
		super();
		this.uname = user.getUname();
		this.pwd = user.getPwd();
		this.email = user.getEmail();
		this.city = user.getCity();
	}
	

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "User [uname=" + uname + ", pwd=" + pwd + ", email=" + email + ", city=" + city + "]";
	}
	
}
