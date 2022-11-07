package com.bootcoding.restaurant.controller;


import com.bootcoding.restaurant.model.Customer;
import com.bootcoding.restaurant.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@Slf4j
@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    @GetMapping("/customer/register")
    public  void registerCustomer(@RequestBody Customer customer){
        log.info("/customer url is invoked by client");
        log.info(customer.toString());
        customerService.createTable();
        customerService.insertCustomer(customer);
    }
 }