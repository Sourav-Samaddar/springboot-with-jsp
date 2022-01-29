package com.sourav.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sourav.model.User;
import com.sourav.services.UserService;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String hello() {
		return "This is home page";
	}
	
	@GetMapping("/saveuser")
	public String saveMyUser(@RequestParam String username,@RequestParam String firstname, 
			@RequestParam String lastName,@RequestParam int age,@RequestParam String password ) {
		userService.saveMyUser(new User(username,firstname,lastName,age,password));
		return "User Saved";
	}
	
}
