package model;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
        Customer customer = new Customer("first", "second", "j@domain.com");
        System.out.println(customer);

        Room room = new Room("100", 135.00, RoomType.DOUBLE);
        System.out.println(room);

        Calendar cal = Calendar.getInstance();
        cal.set(2004, 0, 7, 15, 40);
        Reservation reservation = new Reservation(customer, room, );

    }
}
