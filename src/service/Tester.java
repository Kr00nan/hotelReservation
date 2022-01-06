package service;

import model.*;

import java.util.Date;

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

        // test ReservationService.addRoom()
        addRoom(new Room("102", 106.00, RoomType.SINGLE));
        addRoom(new Room("103", 212.00, RoomType.DOUBLE));
        addRoom(new FreeRoom("104", RoomType.SINGLE));
        addRoom(new FreeRoom("105", RoomType.DOUBLE));

        // test ReservationService.getARoom()
        System.out.println(getARoom("102"));
        System.out.println(getARoom("103"));
        System.out.println(getARoom("104"));
        System.out.println(getARoom("105"));
        System.out.println(getARoom("106"));

        // test ReservationService.reserveARoom()
        reserveARoom(getCustomer("michael@kroon.com"), getARoom("102"), new Date(), new Date());
        reserveARoom(getCustomer("tyler@garlick.com"), getARoom("104"), new Date(), new Date());

        // test ReservationService.findRooms()


        // test ReservationService.getCustomerReservations()
        getCustomerReservations(getCustomer("tyler@garlick.com"));
        System.out.println(getCustomerReservations(getCustomer("tyler@garlick.com")));

        // test ReservationService.printAllReservations()
        printAllReservations();
    }
}
