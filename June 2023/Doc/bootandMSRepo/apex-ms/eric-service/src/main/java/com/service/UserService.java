package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.model.User;
import com.model.Users;

@Service
public class UserService {
	private static Users list = new Users();

	static {
		list.getUserList().add(new User("Adam", "pass@123", "adam@mail.com", "London"));
		list.getUserList().add(new User("Sam", "sam@123", "sam@mail.com", "NY"));
		list.getUserList().add(new User("Yukta", "yukta@123", "yukta@mail.com", "delhi"));

	}

	public static Users getList() {
		return list;
	}

	public User getUser(String name) {
		
		for(User usr: list.getUserList()) {
			if(usr.getUname().equals(name)) {
				return usr;
			}
			
		}
		return null;
	}
	
	
	public void addUser(User user) {
		list.getUserList().add(user);
	}

}
