package model;

import static model.RoomType.SINGLE;

public class Tester {
    public static void main(String[] args) {
        Customer customer = new Customer("Jinny", "Weasley", "email@emailServer.com");
        System.out.println(customer);

        Room room = new Room("13", 100.00, SINGLE);
        System.out.println(room);
    }
}
