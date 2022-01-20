package com.example.bestburgerdelivery.MainClasses;

public class Employee extends Users{
    String type;
    int salary;

    public Employee(String name, String surname, String email, String phone, String type, int employeeId, int salary) {
        super(name, surname, email, phone);
        setType(type);
        setSalary(salary);
    }

    public String getType() {
        return type;
    }

    private void setType(String type) {
        this.type = type;
    }

    public int getSalary() {
        return salary;
    }

    private void setSalary(int salary) {
        this.salary = salary;
    }
}
