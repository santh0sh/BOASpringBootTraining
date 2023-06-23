package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.User;
@Repository
public interface UserDAO extends CrudRepository<User, String>{
	
	@Transactional
	@Modifying
	@Query("update User set pass= :pass,email =:email,city =:city where uname =:name")
	public Integer updateUserByUserName(String pass,String email,String city,String name);
	
	@Query("SELECT u from User u ORDER BY uname")
	public List<User> findAllinSort();

}
