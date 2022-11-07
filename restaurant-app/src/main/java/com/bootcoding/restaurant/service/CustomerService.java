package com.bootcoding.restaurant.service;

import com.bootcoding.restaurant.common.Constant;
import com.bootcoding.restaurant.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import javax.sql.DataSource;
import java.sql.*;
import java.util.Date;

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
            StringBuilder query = new StringBuilder();
            query.append("create table")
                    .append(" app_customer (")
                    .append("id bigint ,")
                    .append("firstName character varying(200) ,")
                    .append("lastName character varying(200) ,")
                    .append("address character varying(2000) ,")
                    .append("email character varying(200) ,")
                    .append("state character varying(200) ,")
                    .append("city character varying(200) ,")
                    .append("password character varying(200) ,")
                    .append("date timestamp ,")
                    .append("modified_date timestamp ,")
                    .append("mobile bigint )");
                    //.append("registration_date timestamp ,")
                    //.append("modified_date timestamp ,")

            System.out.println(query.toString());
           /* String query = "CREATE TABLE app_customer (String firstName,String lastName,String address,String email," +
                    "String password,String city,String state,int userId,long mobile)";
            System.out.println("Create Table Query : " + query);*/
            stmt.executeUpdate(String.valueOf(query));
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public void insertCustomer(Customer customer) {
        try {

            Connection con = restaurantDataSource.getConnection();
            Statement stmt = con.createStatement();
            String query = "INSERT INTO app_customer VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1,customer.getUserId());
            ps.setString(2, customer.getFirstName());
            ps.setString(3, customer.getLastName());
            ps.setString(4, customer.getAddress());
            ps.setString(5, customer.getEmail());
            ps.setString(6, customer.getState());
            ps.setString(7, customer.getCity());
            ps.setString(8, customer.getPassword());
            ps.setTimestamp(9,new Timestamp(new Date().getTime()));
            ps.setTimestamp(10,new Timestamp(new Date().getTime()));
            ps.setLong(11,customer.getMobile());
            ps.executeUpdate();
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}