package com.fudan.lab2logreg.service;

import com.fudan.lab2logreg.mapper.UserMapper;
import com.fudan.lab2logreg.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public void register(User user) {
        userMapper.insertUser(user);
    }

    public boolean login(String email, String password) {
        User user = userMapper.findByEmail(email);
        return user != null && user.getPassword().equals(password); // 这里可以加密比较
    }
}

