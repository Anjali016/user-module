package com.fc.www;

import com.fc.www.dto.User;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MappedTypes(User.class)
@MapperScan("com.fc.www.mapper")
@SpringBootApplication
public class UserApp {

  public static void main(String[] args) {
    SpringApplication.run(UserApp.class, args);
  }
}
