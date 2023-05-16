package com.report;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.report.model.Role;
import com.report.model.User;
import com.report.model.UserRole;
import com.report.service.UserService;

@SpringBootApplication
public class ClassReportApplication implements CommandLineRunner {
	@Autowired
	private UserService userService;
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(ClassReportApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		User user = new User();
//		
//		user.setFirstName("swapnil");
//		user.setLastName("jounjalkar");
//		user.setEmail("jounjalkarswapnil@gmail.com");
//		user.setUsername("swapniljounjalkar");
//		user.setPassword(this .bCryptPasswordEncoder.encode("abc"));
//		user.setProfile("default.png");
//		
//	    
//		
//		Role role1= new Role();
//		
//		role1.setRoleId(44L);
//		role1.setRoleName("Admin");
//		
//		Set<UserRole> userRoleSet = new HashSet<>();
//		
//		UserRole userRole=new UserRole();
//		userRole.setRole(role1);
//		userRole.setUser(user);
//		
//		userRoleSet.add(userRole);
//		
//	//	
//		User user1 =this.userService.createUser(user, userRoleSet);
//		System.out.println(user1.getUsername());
		
	}

}
