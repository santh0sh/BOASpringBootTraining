package com.boa.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.boa.model.User;

@Service
public class UserService {
	private List<User> userList = new ArrayList<>();

	public Boolean validateLogin(User user) {

		return ("admin".equals(user.getUname()) && "manager".equals(user.getPwd()));
	}

	public String registerUser(User user) {
		userList.add(user);
		System.out.println(user.toString());
		return "User registered";
	}

	public List<User> loadusers() {
		return userList;
	}

	public User findUser(String name) {

		User returnUser = new User();
		for (User user : userList) {
			if (user.getUname().equals(name)) {
				returnUser = user;
			}
		}
		return returnUser;
	}

	public boolean deleteUser(String name) {

		for (User user : userList) {
			if (user.getUname().equals(name)) {
				return userList.remove(user);
			}
		}
		return false;
	}
	
	public User updateUser(String name,User user){
		
		User returnUser = new User();
		for(User us : userList) {
			if(us.getUname().equals(name)) {
				userList.remove(us);
				user.setUname(name);
				returnUser = new User(user);
				userList.add(returnUser);
			}
		}
		return returnUser;
	}
}
