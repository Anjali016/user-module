package com.fc.www.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.fc.www.service.UserService;

@RestController
public class Login {
	
	@Autowired
	private UserService userservice;
	
	@RequestMapping(method = RequestMethod.GET, value = "user/login")
	void signin(String userId, String password) {
		userservice.signIn(userId, password);
	}
}
