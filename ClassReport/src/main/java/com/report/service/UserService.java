package com.report.service;

import java.util.Set;

import com.report.model.User;
import com.report.model.UserRole;



public interface UserService {

	//creating user
	public User createUser(User user, Set<UserRole> userRole) throws Exception;
	
	//get user by username
	
	 public User getUser(String username);
	 
	 //delete user by id
	 
	 public void deleteuserbyid(Long id);
	
}
