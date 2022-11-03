package com.bootcoding.restaurant.utils;

import java.util.Random;

public class OTPGenerator {

    static Random random = new Random();

    public static int getOTP(){
        int otp = random.nextInt(999999);
        otp = 100000 + otp;
        System.out.println(otp);
        return otp;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++){
            OTPGenerator.getOTP();
        }
    }
}
