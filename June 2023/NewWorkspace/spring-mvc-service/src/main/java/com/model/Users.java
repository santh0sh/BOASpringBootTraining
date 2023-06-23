package com.model;

import java.util.ArrayList;
import java.util.List;

public class Users {
	
	private List<User> userList;

	public List<User> getUserList() {
		if(userList == null) {
			userList= new ArrayList<User>();
		}
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
	
	
	

}
