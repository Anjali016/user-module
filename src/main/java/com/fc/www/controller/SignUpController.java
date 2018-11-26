package com.fc.www.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fc.www.dto.User;
import com.fc.www.service.UserService;

@RestController
public class SignUpController {

  @Autowired private UserService userservice;

  @RequestMapping(method = RequestMethod.POST, value = "user/signup")
  void signup(@RequestBody User user) {
    userservice.createUser(user);
  }
}
