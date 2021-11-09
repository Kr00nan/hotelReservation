package service;

import model.Customer;

import java.util.*;

public class CustomerService {

    private static Map<String, Customer> customers = new HashMap<>();

    public static void addCustomer(String email, String firstName, String lastName){
        Customer customer = new Customer(firstName, lastName, email);
        customers.put(customer.getEmail(), customer);
    }

    public static Customer getCustomer(String customerEmail){
        return customers.get(customerEmail);
    }

    public static Collection<Customer> getAllCustomers(){
        Collection<Customer> customerArrayList = new ArrayList<>();
        for (Customer customerInfo : customers.values()) {
            customerArrayList.add(customerInfo);
        };
        return customerArrayList;
    }

}
