package com.dao;

import org.springframework.stereotype.Repository;

import com.model.User;
import com.model.Users;

@Repository
public class UserDaoImpl implements UserDao {

	private static Users list = new Users();

	static {
		list.getUserList().add(new User(1, "alex", "alex123", "alex@mail.com", "NY"));
		list.getUserList().add(new User(2, "davis", "davis123", "davis@mail.com", "MEB"));
		list.getUserList().add(new User(3, "Ashu", "ashu123", "ashu@mail.com", "BLR"));
	}

	@Override
	public Users getAllUsers() {

		return list;
	}

	@Override
	public void addUsers(User user) {
		 list.getUserList().add(user);
		
	}

}
