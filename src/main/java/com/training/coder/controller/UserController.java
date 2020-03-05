package com.training.coder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.coder.document.Users;
import com.training.coder.repository.UserRepository;



@RestController
@RequestMapping("/rest/users")
public class UserController {
	
	
	
	@Autowired
	UserRepository userRepository;
	
	  @GetMapping("/all")
	    public List<Users> getAll() {
	        return userRepository.findAll();
	    }

}
