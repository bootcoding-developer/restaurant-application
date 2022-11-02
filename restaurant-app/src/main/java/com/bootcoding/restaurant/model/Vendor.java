package com.bootcoding.restaurant.model;

import lombok.Data;

import java.util.Date;

@Data
public class Vendor
{
    private int id;
    private String vendorOwner;
    private String vendorName;
    private long phone;
    private String address;
    private String email;
    private String userId;
    private String state;
    private String city;
    private Date created;
    private Date modified;
}

