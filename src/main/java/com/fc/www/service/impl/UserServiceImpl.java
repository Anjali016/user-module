package com.fc.www.service.impl;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import com.fc.www.dto.User;
import com.fc.www.service.UserService;

public class UserServiceImpl implements UserService{
	
	private SqlSessionFactory sqlSessionFactory = null;

	public UserServiceImpl(SqlSessionFactory sqlSessionFactory ){
		this.sqlSessionFactory = sqlSessionFactory;
	}
	
	@Override
	public void create(User user) {
		  SqlSession session = sqlSessionFactory.openSession();
		  try {
			  session.insert("User.insert",user);
		  }
		  finally {
			  session.commit();
			  session.close();
		  }
	}

	@Override
	public void delete(User user) {
		  SqlSession session = sqlSessionFactory.openSession();
		  try {
			  session.delete("User.delete",user);
		  }
		  finally {
			  session.commit();
			  session.close();
		  }
		
	}
	
	@Override
	public void signIn(String userID, String password) {
		  SqlSession session = sqlSessionFactory.openSession();
		  try {
			  if(findUser(userID) != null) {
				  if(true); // check user password is same as the column password.
				  System.out.println("welcome");
					  System.out.println("Incorrect Password");
				  }
		  }
		  finally {
			  session.commit();
			  session.close();
		  }
	}
	
	@Override
	public User findUser(String userID) {
			User query = null;
			  SqlSession session = sqlSessionFactory.openSession();
			  try {
				  query = session.selectOne("", userID);
			  }
			  finally {
				  session.close();
			  }
			return query;
	}
	
	
	@Override
	public User update(User user) {
		return null;
	}

}
