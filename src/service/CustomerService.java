package service;

import model.Customer;

import java.util.HashMap;
import java.util.Map;

public class CustomerService {

    private static Map<String, Customer> customers = new HashMap<>();

    public static void addCustomer(String email, String firstName, String lastName){
        Customer customer = new Customer(firstName, lastName, email);
        customers.put(customer.getEmail(), customer);
    }

    public static Customer getCustomer(String customerEmail){
        return customers.get(customerEmail);
    }

    public static void getAllCustomers(){
        System.out.printf("%s customers in the system:\n", customers.size());
        for (Customer customerInfo : customers.values()) {
            System.out.printf("\n%s\n", customerInfo);
        };
    }

}
