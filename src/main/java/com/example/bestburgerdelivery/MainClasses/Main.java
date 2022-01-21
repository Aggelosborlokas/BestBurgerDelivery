package com.example.bestburgerdelivery.MainClasses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        try {
            // Make the connection

            /*String url = "jdbc:postgresql://localhost:5432/Best Burger Delivery";
            Properties props = new Properties();
            props.setProperty("user","Giorgos");
            props.setProperty("password","1234");
            props.setProperty("ssl","false");
            Connection conn = DriverManager.getConnection(url, props);*/
            Class.forName("org.postgresql.Driver");
            Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Best Burger Delivery", "Giorgos", "1234");


        }catch(Exception e){
            System.out.println("AdminD Error");
            e.printStackTrace();
        }
    }
}
