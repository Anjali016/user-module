package com.fc.www.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fc.www.dto.User;
import com.fc.www.service.UserService;

@RestController
public class LoginController {

  @Autowired private UserService userservice;

  @RequestMapping(method = RequestMethod.GET, value = "user/all")
  public List<User> getAll() {
    return userservice.getAll();
  }

  @RequestMapping(method = RequestMethod.GET, value = "user/{userId}")
  List<User> getUser(@PathVariable String userId) {
    return userservice.findUser(userId);
  }

  
  @RequestMapping(method = RequestMethod.GET, value = "user/login/{userId}/{password}")
  String signin(
      @PathVariable(value = "userId") String userId,
      @PathVariable(value = "password") String password) {
    return userservice.signIn(userId, password);
  }

  @RequestMapping(method = RequestMethod.PUT, value = "user/update")
  void updateUser(@RequestBody User user) {
    userservice.update(user);
  }

  //	@RequestMapping(method = RequestMethod.GET, value = "user/login")
  //	void signin(User user) {
  //		userservice.signIn(user.getUserId(), user.getPassword());
  //	}	
  
//@RequestMapping(method = RequestMethod.GET, value = "user/login")
//  String signin(
//      @RequestParam(value = "userId") String userId,
//      @RequestParam(value = "password") String password) {
//    return userservice.signIn(userId, password);
//  }


}
