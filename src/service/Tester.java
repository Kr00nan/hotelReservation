package service;

import static service.CustomerService.*;
import static service.ReservationService.*;

public class Tester {
    public static void main(String[] args) {
        // test CustomerService.addCustomer; adds 4 customers to customers Collection
        addCustomer("Michael", "Kroon", "michael@kroon.com");
        addCustomer("Tyler", "Garlick", "tyler@garlick.com");
        addCustomer("Jericho", "Chesley", "jericho@chesley.com");
        addCustomer("Glenn", "Stauffer", "glenn@stauffer.com");

        // test CustomerService.getCustomer; returns Customer "Michael", "Kroon", "michael@kroon.com"
        System.out.println(getCustomer("michael@kroon.com"));

        // test CustomerService.getAllCustomers; returns customers Collection, 4 customers
        System.out.println(getAllCustomers());

        // test
    }
}
