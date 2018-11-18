package com.fc.www.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class User {	
	private String userID;
	private String firstName;
	private String lastName;
	private String password;

	public User(String userID, String firstName, String lastName, String password) {
		this.userID = userID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
	}
}
