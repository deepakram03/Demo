package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired  
	UserRepository userRepository;  

	public List<User> getAllUsers()   
	{  
	List<User> user = new ArrayList<User>();  
	userRepository.findAll().forEach(user1 -> user.add(user1));  
	return user;  
	}  
	
}
