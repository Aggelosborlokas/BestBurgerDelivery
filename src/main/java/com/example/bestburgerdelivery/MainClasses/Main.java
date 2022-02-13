package com.example.bestburgerdelivery.MainClasses;

import java.sql.*;


public class Main {
    public static void main(String[] args) {
        try {
            // Make the connection
            Class.forName("org.postgresql.Driver");
            Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Best Burger Delivery", "Giorgos", "1234");

            // Make & Execute the Query
            String sql = "select * from admin where name=?";
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, "'Lexie");
            ResultSet rs = p.executeQuery();

            // Take the Result of the Query and make a Admin
            while(rs.next()){
                System.out.println(rs.getString("email") + " " +rs.getString("name"));
            }

            // Close Connection
            c.close();

        }catch(Exception e){
            System.out.println("AdminD Error");
            e.printStackTrace();
        }
    }
}
