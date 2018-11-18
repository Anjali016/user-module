package com.fc.www.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fc.www.dao.UserDao;
import com.fc.www.dto.User;
import com.fc.www.service.UserService;

@Repository
public class UserDaoImpl implements UserDao{
	
	
	private SqlSessionFactory sqlSessionFactory = null;

	public UserDaoImpl(SqlSessionFactory sqlSessionFactory ){
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
