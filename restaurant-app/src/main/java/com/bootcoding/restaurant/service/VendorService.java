package com.bootcoding.restaurant.service;

import com.bootcoding.restaurant.model.Vendor;

import java.util.HashMap;
import java.util.List;

public class VendorService
{
    private HashMap<Integer,Vendor> vendorMap =new HashMap<>();

    public static void main(String[] args) {
        VendorService vs = new VendorService();
        vs.getVendorById(1);
    }
    public  Vendor getVendorById(int id)
    {
        Vendor v1 = new Vendor();
        v1.setId(id);
        v1.setVendorName("Smit");
        v1.setMobile(885705874);
        v1.setAddress("Dighori");
        v1.setEmail("smit@gmail.com");
        v1.setUserId("am1");
        v1.setPassId("am1");
        v1.setState("Maharashtra");
        v1.setCity("Nagpur");

        vendorMap.put(v1.getId(), v1);
//        new JsonStore().storeVendor(v1, "C://restaurant-app//vendor.json");
        return v1;



    }
    public static String creteVendor()
    {
        Vendor cv = new Vendor();
        System.out.println("Vendor Id ="+cv.getId()+
                "Vendor Name="+cv.getVendorName()+
                " Vendor Mobile="+cv.getMobile()+" " +
                "Vendor Address="+cv.getAddress()+"" +
                "Vendor Email="+cv.getEmail()+
                " Vendor UserId="+cv.getUserId()+
                " Vendor Password="+cv.getPassId()+
                " Vendor State="+cv.getState()+
                "Vendor City="+cv.getCity());

        return "Vendor Created";
    }
    private static void registerVendor()
    {

    }
}
