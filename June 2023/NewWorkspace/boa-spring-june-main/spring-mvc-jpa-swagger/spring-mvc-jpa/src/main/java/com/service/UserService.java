package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDAO;
import com.model.User;

@Service
public class UserService {
	@Autowired
	private UserDAO dao;
	ArrayList<User> al = new ArrayList<User>();

	public boolean loginValid(User user) {
		if (user.getUname().equals("admin") && user.getPass().equals("pass123")) {
			return true;
		}
		return false;
	}

	public void addUser(User user) {
		dao.save(user);
	}

	public List<User> loadUsers() {
		//return (List) dao.findAll();
		return (List) dao.findAllinSort();
	}

	public boolean findUser(String name) {

		Optional<User> data = dao.findById(name);
		if (data.isPresent()) {
			return true;
		}
		return false;
	}

	public boolean deleteUser(String name) {
		Optional<User> data = dao.findById(name);
		if (data.isPresent()) {
			
			dao.deleteById(name);
			return true;
		}
		return false;
	}

	public void updateUser(String name, User user) {
		 dao.updateUserByUserName(user.getPass(), user.getEmail(), user.getCity(), name);

	}

}
