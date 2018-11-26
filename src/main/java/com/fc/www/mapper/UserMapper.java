package com.fc.www.mapper;

import com.fc.www.dto.User;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface UserMapper {

  @Insert(
      "INSERT INTO user(userid, firstname, lastname, password) VALUES(#{userId}, #{firstName}, #{lastName}, #{password})")
  void create(User user);

  @Select("SELECT * FROM user WHERE userid = #{userId}")
  List<User> findUser(String userID);

  @Select("Select password from user where userid = #{userId}")
  String getPassword(String UserId);

  @Update(
      "UPDATE user SET  firstname = #{firstName}, lastname = #{lastName}, password = #{password} WHERE userid = #{userId}")
  void update(User user);

  String signIn(String userID, String password);

  @Select("Select * from user")
  List<User> getAllUser();

  @Delete("Delete from user where userid = #{userId}")
  void delete(String userId);
}
