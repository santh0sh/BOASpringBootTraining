package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.model.User;

@Service
public class UserService {
	ArrayList<User> al = new ArrayList<User>();

	public boolean loginValid(User user) {
		if (user.getUname().equals("admin") && user.getPass().equals("pass123")) {
			return true;
		}
		return false;
	}

	public void addUser(User user) {
		al.add(user);
		System.out.println(al);
	}

	public List<User> loadUsers() {
		return al;
	}

	public boolean findUser(String name) {
		for (User user : al) {
			if (user.getUname().equals(name)) {
				return true;
			}
		}
		return false;
	}

	public boolean deleteUser(String name) {
		for (User user : al) {
			if (user.getUname().equals(name)) {
				al.remove(user);
				return true;
			}
		}
		return false;
	}

	public void updateUser(String name, User user) {
		for (User usr : al) {
			if (usr.getUname().equals(name)) {
				al.set(al.indexOf(usr), user);

			}
		}

	}

}
