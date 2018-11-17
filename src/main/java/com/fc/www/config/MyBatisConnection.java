package com.fc.www.config;
import org.apache.ibatis.session.SqlSessionFactory;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class MyBatisConnection {
		private static SqlSessionFactory sqlsessionfactory;
		static {
			Reader reader = null;
			try {
				   reader = Resources.getResourceAsReader("database-config.xml");
			}
			catch(IOException e) {
				   throw new RuntimeException(e.getMessage());

			}
		
			  sqlsessionfactory = new SqlSessionFactoryBuilder().build(reader);

		}
		public static SqlSessionFactory getSqlSessionFactory() {
		  return sqlsessionfactory;
			    }
}
