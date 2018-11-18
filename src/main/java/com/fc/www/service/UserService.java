package com.fc.www.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fc.www.dao.UserDao;
import com.fc.www.dto.User;

@Service
public class UserService {
	
 @Autowired 
 private UserDao userdao;
 
 public void createUser(User user) {
	 userdao.create(user);
 }
 
 public void delete(User user) {
	 userdao.delete(user);
 }
 public void signIn(String userID, String password) {
	 userdao.signIn(userID, password);
 }
}
