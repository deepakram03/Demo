package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired  
	UserService userService;  

	@GetMapping("/user")  
	private List<User> getAllUsers()   
	{  
		System.out.println("inside getAllUsers in ctrler");
	return userService.getAllUsers(); 
	
	}  
	
}
