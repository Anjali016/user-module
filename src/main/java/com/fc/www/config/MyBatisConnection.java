package com.fc.www.config;
import org.apache.ibatis.session.SqlSessionFactory;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.fc.www")
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
				if(sqlsessionfactory == null) {
			  sqlsessionfactory = new SqlSessionFactoryBuilder().build(reader);
				}
		}
	@Bean
		public static SqlSessionFactory getSqlSessionFactory() {
		  return sqlsessionfactory;
			    }
}
