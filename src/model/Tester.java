package model;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
        Customer customer = new Customer("Michael", "Kroon", "michael@kroon.com");
//        System.out.println(customer);

        Room room = new Room("100", 135.00, RoomType.DOUBLE);
//        System.out.println(room);

        Reservation reservation = new Reservation(customer, room, new Date(), new Date());
        System.out.println(reservation);

    }
}
