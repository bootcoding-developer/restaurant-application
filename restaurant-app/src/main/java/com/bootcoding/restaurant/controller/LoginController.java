package com.bootcoding.restaurant.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class LoginController {

    @GetMapping("/login")
    public  Object authenticate(@RequestBody String request){
        log.info("/login url is invoked by client");
        log.info("User Request is " + request);
        return new Object();
    }

}
