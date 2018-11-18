package com.fc.www.dao;

import com.fc.www.dto.User;

public interface UserDao {
	
	void create(User user);
	void delete (User user);
	User findUser(String userID);
	User update (User user);
	void signIn(String userID, String password);
	
}
