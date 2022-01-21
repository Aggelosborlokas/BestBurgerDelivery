package com.example.bestburgerdelivery.MainClasses;

import java.sql.Connection;
import java.sql.DriverManager;


public class Main {
    public static void main(String[] args) {
        try {
            // Make the connection
            Class.forName("org.postgresql.Driver");
            Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Best Burger Delivery", "Giorgos", "1234");
        }catch(Exception e){
            System.out.println("AdminD Error");
            e.printStackTrace();
        }
    }
}
