package com.example.bestburgerdelivery.MainClasses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Main {
    public static void main(String[] args) {
        try {
            // Make the connection
            Class.forName("org.postgresql.Driver");
            Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Best Burger Delivery", "Giorgos", "1234");

            // Make & Execute the Query
            Statement query = c.createStatement();
            ResultSet rs = query.executeQuery("select * from admin");

            // Take the Result of the Query and make a Admin
            if(rs.next()){
                System.out.println(rs.getString("email") + " " +rs.getString("name"));
            }

            // Close Connection
            c.close();

            // Print to console the created Admin
            /*if(admin != null) {
                System.out.println("Admin Exists");
            }*/
        }catch(Exception e){
            System.out.println("AdminD Error");
            e.printStackTrace();
        }
    }
}
