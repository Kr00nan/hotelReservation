package service;

import model.Customer;
import java.util.*;

public class CustomerService {

    private static Collection<Customer> customers = new LinkedList<>();

    public static void addCustomer(String firstName, String lastName, String email){
        customers.add(new Customer(firstName, lastName, email));
    }

    public static Customer getCustomer(String customerEmail){
        Customer customer = null;
        for(Customer theOne : customers) {
            if (theOne.getEmail().equals(customerEmail)) {
                customer = theOne;
            }
        }
        return customer;
    }

    public static Collection<Customer> getAllCustomers(){
        return customers;
    }

}
