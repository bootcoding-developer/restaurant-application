package com.bootcoding.restaurant.model;

import lombok.Data;

@Data
public class Customer {

    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private int cId;
    private long mobile;
    private String city;
    private String State;
    private String cPassword;

}
