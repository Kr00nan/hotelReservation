package model;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
        Customer customer = new Customer("Michael", "Kroon", "michael@kroon.com");
        System.out.println(customer);

        Room room = new Room("100", 135.00, RoomType.DOUBLE);
        FreeRoom room1 = new FreeRoom("101", RoomType.SINGLE);
        System.out.println(room);
        System.out.println(room1);

        Reservation reservation = new Reservation(customer, room, new Date(), new Date());
        Reservation reservation1 = new Reservation(new Customer("Glenn", "Stauffer", "glenn@stauffer.com"), room1, new Date(), new Date());
        System.out.println(reservation);
        System.out.println(reservation1);

    }
}
