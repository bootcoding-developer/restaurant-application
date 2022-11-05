package com.bootcoding.restaurant.service;

import com.bootcoding.restaurant.model.Customer;
import com.bootcoding.restaurant.model.Vendor;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerService {

    private DataSource restaurantDataSource;

    public CustomerService(DataSource restaurantDataSource){
        this.restaurantDataSource = restaurantDataSource;
    }

    public boolean register(Customer customer) throws SQLException {
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

