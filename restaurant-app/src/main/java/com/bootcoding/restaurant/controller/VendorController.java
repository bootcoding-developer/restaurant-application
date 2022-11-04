package com.bootcoding.restaurant.controller;

import com.bootcoding.restaurant.model.Vendor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class VendorController
{

    @GetMapping("/vendor/register")
    public void registerVendor(@RequestBody Vendor vendor)
    {
        log.info("/vendor url is invoked by client");
        log.info(vendor.toString());

    }
}
