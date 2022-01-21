package com.example.bestburgerdelivery.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.example.bestburgerdelivery.MainClasses.Admin;


public class AdminD {
    Admin admin;

    public Admin searchAdmin(String username) throws ClassNotFoundException, SQLException {

        try {
            // Make the connection
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/doctorappointment?useSSL=false", "root", "1234");

            // Make & Execute the Query
            Statement query = connection.createStatement();
            ResultSet rs = query.executeQuery("select * from admin where (username='" + username +"')");

            // Take the Result of the Query and make a Admin
            if(rs.next()){
                //admin = new Admin(rs.getString("username"), rs.getString("hashedpassword"), rs.getString("salt"), rs.getInt("userid"));
            }

            // Close Connection
            connection.close();

            // Print to console the created Admin
            if(admin != null)
                System.out.println("Admin Exists");

        }catch(Exception e){
            System.out.println("AdminD Error");
            e.printStackTrace();
        }

        return admin;
    }
}
