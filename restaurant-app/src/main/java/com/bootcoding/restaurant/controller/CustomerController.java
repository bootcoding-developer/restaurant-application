package com.bootcoding.restaurant.controller;


import com.bootcoding.restaurant.model.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class CustomerController {

    @GetMapping("/customer/register")
    public void registerCustomer(){

        Customer c = new Customer();
        c.setUserId(1);c.setFirstName("Customer");c.setLastName("1");c.setCity("Nagpur");c.setState("Maharashtra");
        c.setMobile(987654321);c.setEmail("c1@gmail.com");c.setPassword("c1@Pass");
        log.info("/customer url is invoked by client");
        System.out.println("Hello!");
    }
    @GetMapping("/customer/details")
    public void getCustomerDetails(){

        Customer c = new Customer();
        c.getUserId();c.getFirstName();c.getLastName();c.getCity();c.getState();
        c.getMobile();c.getEmail();c.getPassword();

    }
}
