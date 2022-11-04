package com.bootcoding.restaurant.model;

import lombok.Data;

import java.util.Date;

@Data
public class Vendor
{
    private int id;
    private String vendorName;
    private long phone;
    private String address;
    private String email;
    private String userId;
    private String passId;
    private String state;
    private String city;

}

