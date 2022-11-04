package com.bootcoding.restaurant.controller;

import com.bootcoding.restaurant.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserController {
     @GetMapping("/user/register")
    public void registerUser(@RequestBody User user){
         log.info("/user url invoked by client");
         log.info(user.getUserId());
         log.info("/n user Id -" +user.getUserId()+"\n fristname -"+user.getFirstName()+"\n User Name -"+user.getUsername());
     }
}
