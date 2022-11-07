package com.bootcoding.restaurant.service;

import com.bootcoding.restaurant.model.User;
import com.bootcoding.restaurant.model.Vendor;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.*;

@Service
public class UserService {

    public static final String TABLE_NAME = "app_user";
    private DataSource restaurantDataSource;

    public UserService(DataSource restaurantDataSource){
        this.restaurantDataSource = restaurantDataSource;
    }

    public boolean register(User user) throws SQLException {
        Connection connection = null;
        try {
            connection = restaurantDataSource.getConnection();

            Statement statement = connection.createStatement();
            String query = "INSERT INTO " + TABLE_NAME + " VALUES ( ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setLong(1, user.getId());
            ps.setString(2,user.getFirstName());
            ps.setString(3, user.getLastName());
            ps.setString(4, user.getPassword());
            ps.setString(5,user.getUserType());
            ps.setString(6, user.getUserId());
            ps.setString(7, user.getUsername());
            ps.executeUpdate();


        }catch (Exception exception){
            exception.printStackTrace();
        }finally {
            connection.close();
        }
        return true;
    }

    public void createTable() throws SQLException {

    Connection con = restaurantDataSource.getConnection();
    Statement st = con.createStatement();

        String query = "CREATE TABLE IF NOT EXISTS " + "app_user"
                + " ( id bigint NOT NULL, "
                + " Firstname text,"
                + " LastName text,"
                + " Password text,"
                + " UserType text,"
                + " UserId text,"
                + " Username text,"
                + " CONSTRAINT app_user_pk PRIMARY KEY (id))";

        System.out.println(query);

    st.executeUpdate(query);
    con.close();
    }

    public void insertTable() throws SQLException {
        Connection con = restaurantDataSource.getConnection();
        Statement st = con.createStatement();
        String query = "INSERT INTO " + TABLE_NAME + " VALUES ( ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setLong(1, 2);
        ps.setString(2,"Abcd");
        ps.setLong(4, 7222333);
        ps.setString(5, "Vendor");
        ps.setString(3,"Akshali");
        ps.setString(6, "Modak");
        ps.setString(7, "Modak");
        ps.executeQuery();
        con.close();
    }
}
