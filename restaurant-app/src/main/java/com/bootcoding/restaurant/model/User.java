package com.bootcoding.restaurant.model;

import lombok.Data;

@Data
public class User {
    private long id;
    private String firstName;
    private String username;
    private String password;
    private UserType userType; // type of user // Vendor or Customer
    private String userId; // can be CustomerId or VendorId

}
