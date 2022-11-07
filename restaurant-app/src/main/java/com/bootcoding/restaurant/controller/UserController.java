package com.bootcoding.restaurant.controller;

import com.bootcoding.restaurant.model.User;
import com.bootcoding.restaurant.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@RestController
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping("/user/register")
    public void registerUser(@RequestBody User user) throws SQLException {
         log.info("/user url invoked by client");
         log.info(user.getUserId());
         log.info(user.toString());
         userService.createTable();
         userService.register(user);
//         log.info("/n user Id -" +user.getUserId()+"\n first name -"+user.getFirstName()+"\n User Name -"+user.getUsername());
     }
}
