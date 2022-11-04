package com.bootcoding.restaurant.controller;


import com.bootcoding.restaurant.model.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class CustomerController {

    @GetMapping("/customer/register")
    public  void registerCustomer(@RequestBody Customer customer){
        log.info("/customer url is invoked by client");
        log.info("\n User Id - "+customer.getUserId()+"\n Name - "+customer.getFirstName()+" "+customer.getLastName()+
                "\t Mobile - "+customer.getMobile()+"\t Email - "+customer.getEmail()+"\tAddress - "+customer.getAddress()+","
        +customer.getCity()+","+customer.getState()+"");
    }
 }