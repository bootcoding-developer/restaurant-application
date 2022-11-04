package com.bootcoding.restaurant.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserController {
     @GetMapping("/user/register")
    public void register(){
         log.info("/user url invoked by client");
         log.info("Enter your username");
     }

}
