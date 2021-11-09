package service;


import static service.CustomerService.*;

public class Tester {
    public static void main(String[] args) {

        // As a hotel employee I want to add customers
        addCustomer("michael@kroon.com", "Michael", "Kroon");
        addCustomer("marybeth@kroon.com", "Marybeth", "Kroon");
        addCustomer("asher@kroon.com", "Asher", "Kroon");
        addCustomer("elizabeth@kroon.com", "Elizabeth", "Kroon");

        // As a hotel employee I want to see a single customer
//        System.out.println(getCustomer("michael@kroon.com"));

        // As a hotel employee I want to see a list of all our customers
//        getAllCustomers();



    }
}
