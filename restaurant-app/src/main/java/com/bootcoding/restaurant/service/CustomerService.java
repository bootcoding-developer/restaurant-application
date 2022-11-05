package com.bootcoding.restaurant.service;

import com.bootcoding.restaurant.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

@Service
public class CustomerService {


    @Autowired
    @Qualifier("restaurantDataSource")
    private DataSource restaurantDataSource;

    public CustomerService(){

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

    public void createTable() {
        try {
            Connection con = restaurantDataSource.getConnection();

            Statement stmt = con.createStatement();
            String query = "CREATE TABLE customertable (String firstName,String lastName,String address,String email," +
                    "String password,String city,String state,int userId,long mobile)";
            System.out.println("Create Table Query : " + query);
            stmt.executeUpdate(query);
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public void insertCustomer() {
        try {
            Customer customer;
            Connection con = restaurantDataSource.getConnection();
            Statement stmt = con.createStatement();
            String query = "INSERT INTO customertable VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1,"smit");
            ps.setString(2,"Patil");
            ps.setString(3,"Dighori");
            ps.setString(4,"smitpatil9090@gmail.com");
            ps.setString(5,"admin@123");
            ps.setString(6,"Nagpur");
            ps.setString(7,"Maharashtra");
            ps.setInt(8,1);
            ps.setLong(9,987654321);
            ps.executeUpdate();
            stmt.executeUpdate(query);
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

