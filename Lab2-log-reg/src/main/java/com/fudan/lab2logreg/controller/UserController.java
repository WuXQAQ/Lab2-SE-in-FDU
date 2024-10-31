package com.fudan.lab2logreg.controller;

import com.fudan.lab2logreg.pojo.Result;
import com.fudan.lab2logreg.pojo.User;
import com.fudan.lab2logreg.request.LoginRequest;
import com.fudan.lab2logreg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public Result register(@RequestBody User user) {
        userService.register(user);
        return Result.success();
    }

    @PostMapping("/login")
    public Result login(@RequestBody LoginRequest loginRequest) {
        if (userService.login(loginRequest.getEmail(), loginRequest.getPassword())) {
            return Result.success();
        } else {
            return Result.error("账号或密码错误");
        }
    }
}

