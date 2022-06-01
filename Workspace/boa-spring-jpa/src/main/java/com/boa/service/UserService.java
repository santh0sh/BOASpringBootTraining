package com.boa.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boa.dao.UserRepo;
import com.boa.model.User;

@Service
public class UserService {

	@Autowired
	UserRepo repo;

	private List<User> userList = new ArrayList<>();

	public Boolean validateLogin(User user) {

		return ("admin".equals(user.getUname()) && "manager".equals(user.getPwd()));
	}

	public String registerUser(User user) {
//		userList.add(user);
		repo.save(user);
		System.out.println(user.toString());
		return "User registered";
	}

	public List<User> loadusers() {
//		return userList;
		return (List<User>) repo.findAll();
	}

	public boolean findUser(String name) {

		Optional<User> found = repo.findById(name);
		return found.isPresent();
	}

	public void deleteUser(String name) {
		repo.deleteById(name);
	}

	public void updateUser(String name, User user) {

		repo.updateEmailByUname(user.getEmail(),name);

	}
}
