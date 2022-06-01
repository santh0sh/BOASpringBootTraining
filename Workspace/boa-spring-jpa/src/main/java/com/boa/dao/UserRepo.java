package com.boa.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.boa.model.User;

@Repository
public interface UserRepo extends CrudRepository<User, String>{
	@Modifying
	@Transactional
	@Query("update User set email=:email where uname=:uname")
	public void updateEmailByUname(String email,String uname);

}
