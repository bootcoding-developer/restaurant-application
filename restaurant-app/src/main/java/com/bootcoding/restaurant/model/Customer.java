package com.bootcoding.restaurant.model;

import lombok.Data;

@Data
public class Customer {

    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private int userId;
    private long mobile;
    private String password;
    private String state;
    private String city;

}
