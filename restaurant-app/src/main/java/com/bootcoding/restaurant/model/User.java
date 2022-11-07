package com.bootcoding.restaurant.model;

import lombok.Data;

@Data
public class User {
    private long id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String userType;
    private String userId;

}
