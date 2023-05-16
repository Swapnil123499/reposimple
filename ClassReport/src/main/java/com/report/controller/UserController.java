package com.report.controller;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.report.model.Role;
import com.report.model.User;
import com.report.model.UserRole;
import com.report.service.UserService;


@RestController

@RequestMapping("/user")
@CrossOrigin("*")

public class UserController { 
	@Autowired
	private UserService userService;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	//creating user
	@PostMapping("/")
	//@CrossOrigin("http://localhost:4200/signup")
	public User CreatUser(@RequestBody User user) throws Exception {
		
		user.setProfile("default.png");
		//encoding password with bcryptpassword encoder
		
		user.setPassword(this.bCryptPasswordEncoder.encode(user.getPassword()));
		
		
		Set<UserRole> roles=new HashSet<>();
		
		Role role =new Role();
		role.setRoleName("Normal");
		role.setRoleId(45L);
     
		
		UserRole userRole=new UserRole();
		
		userRole.setRole(role);
		
		userRole.setUser(user);
		
		roles.add(userRole); 
		
		
		return this.userService.createUser(user, roles);
	}
	
	@GetMapping("/{username}")
	public User getUser(@PathVariable("username") String username) {
		
		return this .userService.getUser(username);
	}
	
	@DeleteMapping("/{id}")
	public void deleteuser(@PathVariable("id") Long id) {
		
	this.userService.deleteuserbyid(id);
		
		
	}
	
	//update code 
	/*@ExceptionHandler(UserPrincipalNotFoundException.class)
	public ResponseEntity<?> exceptionHandler(UserPrincipalNotFoundException ex) {
		return Respon
		
	}*/

}
