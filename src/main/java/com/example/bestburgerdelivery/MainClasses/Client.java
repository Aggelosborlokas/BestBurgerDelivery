package com.example.bestburgerdelivery.MainClasses;

public class Client extends Users{
    String creditCardNumber;
    String address;

    public Client(String name, String surname, String email, String phone, String creditCardNumber, String address) {
        super(name, surname, email, phone);
        setCreditCardNumber(creditCardNumber);
        setAddress(address);
    }

    // Methods
    public void makeOrder(Order order){
        //
    }




    // Getters and Setters
    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    private void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public String getAddress() {
        return address;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    private void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getEmail() {
        return email;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    private void setPhone(String phone) {
        this.phone = phone;
    }

}
