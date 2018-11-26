package com.fc.www.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fc.www.dto.User;
import com.fc.www.mapper.UserMapper;

@Service
public class UserService {

  @Autowired private UserMapper usermapper;

  public void createUser(User user) {
    usermapper.create(user);
  }

  public String deleteUser(String userId) {
    usermapper.delete(userId);
    return "User Signed Out";
  }

  public String signIn(String userId, String password) {
    if (findUser(userId).isEmpty()) return "UserId doesnot exist";
    else {
      if (getPassword(userId).equals(password)) {
        return "Welcome"; // redirect to home
      } else return "Incorrect Password";
    }
  }

  String getPassword(String UserId) {
    return usermapper.getPassword(UserId);
  }

  public List<User> findUser(String userID) {
    return (List<User>) usermapper.findUser(userID);
  }

  public List<User> getAll() {
    return usermapper.getAllUser();
  }

  public void update(User user) {
    usermapper.update(user);
  }
}
