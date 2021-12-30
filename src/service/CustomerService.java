package service;

import model.Customer;

import java.util.*;
import java.util.regex.Pattern;

public class CustomerService {

    private static Collection<Customer> customers = new LinkedList<>();

    public static void addCustomer(String email, String firstName, String lastName){

        String emailRegex = "^(.+)@(.+).(.+)$";
        Pattern pattern = Pattern.compile(emailRegex);

        // check to make sure email format is legit
        if (pattern.matcher(email).matches()) {
            customers.add(new Customer(firstName, lastName, email));
        } else {
            throw new IllegalArgumentException("Email format incorrect; required format: xxx@xxx.xxx");
        }
    }

    public static Customer getCustomer(String customerEmail){
        Customer retval = null;
        for(Customer customer : customers) {
            if (customer.getEmail().equals(customerEmail)) {
                retval = customer;
            }
        }
        return retval;
    }

    public static Collection<Customer> getAllCustomers(){
        return customers;
    }

}
