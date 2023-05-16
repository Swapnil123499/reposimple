package com.report.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.report.model.User;



public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByUsername(String username);
	


	
	
}
