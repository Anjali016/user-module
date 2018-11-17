package com.fc.www.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fc.www.dto.User;
import com.fc.www.service.UserService;

@RestController
public class SignOut {
	
	@Autowired
	private UserService userservice;
	
	@RequestMapping(method = RequestMethod.DELETE, value = "user/signout")
	void signout(User user) {
		userservice.delete(user);
	}
	
}
