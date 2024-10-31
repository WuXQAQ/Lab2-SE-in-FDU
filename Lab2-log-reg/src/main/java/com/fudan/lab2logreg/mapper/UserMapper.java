package com.fudan.lab2logreg.mapper;

import com.fudan.lab2logreg.pojo.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {

    @Insert("INSERT INTO users (username, email, password, role) VALUES (#{username}, #{email}, #{password}, #{role})")
    void insertUser(User user);

    @Select("SELECT * FROM users WHERE email = #{email}")
    User findByEmail(String email);
}

