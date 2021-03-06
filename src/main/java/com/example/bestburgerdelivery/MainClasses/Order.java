package com.example.bestburgerdelivery.MainClasses;

import java.util.ArrayList;
import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.*;


public class Order {
    String emailClient;
    String myDateObj;
    String address;
    List<String> products = new ArrayList<>();
    String creditCardNumber;
    float price;

    public Order(Client client, List<String> products, float price) {
        setAddress(client.getAddress());
        setProducts(products);
        setPrice(price);
        setMyDateObj(getOrderTime());
        setCreditCardNumber(client.getCreditCardNumber());
        setEmailClient(client.getEmail());
    }


    private static int setOrderCount() {
        String data = "";
        try {
            Scanner myReader = new Scanner(new File("src/main/resources/idValue.txt"));
            if(myReader.hasNextLine())
                return Integer.parseInt(myReader.nextLine());
            myReader.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return -1;
    }

    public String getEmailClient() {
        return emailClient;
    }

    private void setEmailClient(String emailClient) {
        this.emailClient = emailClient;
    }

    private void setMyDateObj(String myDateObj) {
        this.myDateObj = myDateObj;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    private void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getMyDateObj() {
        return myDateObj;
    }

    private String getOrderTime(){
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return myDateObj.format(myFormatObj);
    }

    public String getAddress() {
        return address;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    public List<String> getProducts() {
        return products;
    }

    private void setProducts(List<String> products) {
        this.products = products;
    }

    public float getPrice() {
        return price;
    }

    private void setPrice(float price) {
        this.price = price;
    }
}
