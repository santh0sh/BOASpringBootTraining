package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDAO;
import com.model.User;

@Service
public class UserService {
	
	@Autowired
	private UserDAO userdao;
	
	List<User> a1 = new ArrayList<User>();
	public boolean loginValid(User user) {
		if(user.getUname().equals("admin") && user.getPass().equals("admin123")) {
			return true;
		}
		return false;
	}
	
	public String registration(User user) {
		userdao.save(user);
		System.out.println(a1);
		return "User registered";
	}
	
	public List<User> loadUser() {
		userdao.findAll();
		System.out.println(a1);
		return a1;
	}
	
	public boolean findUser(String name) {
		for(User user: a1) {
			if(user.getUname().equals(name)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean deleteUser(String name) {
		for(User user: a1) {
			if(user.getUname().equals(name)) {
				a1.remove(user);
				return true;
			}
		}
		return false;
	}
	
	public void updateUser(String name, User user1) {
		for(User user: a1) {
			if(user.getUname().equals(name)) {
				a1.set(a1.indexOf(user), user1);
			}
		}
	}
}