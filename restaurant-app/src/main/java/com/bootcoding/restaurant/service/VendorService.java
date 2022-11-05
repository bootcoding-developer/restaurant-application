package com.bootcoding.restaurant.service;

import com.bootcoding.restaurant.model.Vendor;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class VendorService {

    private DataSource restaurantDataSource;

    public VendorService(DataSource restaurantDataSource){
        this.restaurantDataSource = restaurantDataSource;
    }


    public boolean register(Vendor vendor) throws SQLException {
        Connection connection = null;
        try {
            connection = restaurantDataSource.getConnection();
            Statement statement = connection.createStatement();

        }catch (Exception exception){
            exception.printStackTrace();
        }finally {
            connection.close();
        }
        return true;
    }

}
