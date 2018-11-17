package com.fc.www.service;

import com.fc.www.dto.User;

public interface UserService {
	
	void create(User user);
	void delete (User user);
	User findUser(String userID);
	User update (User user);
	void signIn(String userID, String password);
	
}
