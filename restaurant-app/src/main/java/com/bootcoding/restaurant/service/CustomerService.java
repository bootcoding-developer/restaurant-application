package com.bootcoding.restaurant.service;

import com.bootcoding.restaurant.model.Customer;

import java.util.HashMap;
import java.util.Map;



    public class CustomerService
    {
        private HashMap<Integer,Customer> customerMap =new HashMap<>();

        public static void main(String[] args) {
            com.bootcoding.restaurant.service.CustomerService vs = new com.bootcoding.restaurant.service.CustomerService();
            vs.getCustomerbyId(1);
        }
        public  Customer getCustomerbyId(int id)
        {
            Customer c1 = new Customer();
            c1.setCId(id);
            c1.setFirstName("Smit");
            c1.setMobile(885705874);
            c1.setAddress("Dighori");
            c1.setEmail("smit@gmail.com");

            c1.setCPassword("am1");
            c1.setState("Maharashtra");
            c1.setCity("Nagpur");

            customerMap.put(c1.getCId(), c1);
//        new JsonStore().storeVendor(v1, "C://restaurant-app//vendor.json");
            return c1;



        }
        public static String creteVendor()
        {
            Customer cv = new Customer();
            System.out.println("Vendor Id ="+cv.getCId()+
                    "Customer Name="+cv.getFirstName()+
                    " Customer Mobile="+cv.getMobile()+" " +
                    "Customer Address="+cv.getAddress()+"" +
                    "Customer Email="+cv.getEmail()+

                    " Customer Password="+cv.getCPassword()+
                    " Customer State="+cv.getState()+
                    "Customer City="+cv.getCity());

            return "Customer Created";
        }
        private static void registerVendor()
        {

        }
    }