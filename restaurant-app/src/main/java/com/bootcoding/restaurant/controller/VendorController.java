package com.bootcoding.restaurant.controller;

import com.bootcoding.restaurant.model.Vendor;
import com.bootcoding.restaurant.model.VendorResponse;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@Data
public class VendorController
{

    @GetMapping("/vendor/register")
    public VendorResponse registerVendor(@RequestBody Vendor vendor)
    {
        log.info("/vendor url is invoked by client");
        log.info(vendor.toString());
        VendorResponse vendorResponse = new VendorResponse();
        vendorResponse.setId(vendor.getId());
        vendorResponse.setMessage("Your restaurant has been registered with US and your vendor id is "
        + vendor.getId());
        return vendorResponse;

    }
}
