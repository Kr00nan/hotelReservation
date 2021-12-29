package service;

import model.*;

import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;

public class ReservationService {

    Collection<IRoom> rooms = new LinkedList<>();

    public void addRoom(Room room){

    }

    public static Room getARoom(String roomNumber){
        return new Room("100",0.0, RoomType.SINGLE);
    }

//    public static Reservation reserveARoom(Customer customer, Room room, Date checkInDate, Date checkOutDate){
//        Reservation reservation = new Reservation();
//        return reservation;
//    }

    public static Collection<IRoom> findRooms(Date checkInDate, Date checkOutDate){
        Collection<IRoom> rooms = new LinkedList<>();
        return rooms;
    }

    public static Collection<Reservation> getCustomerReservations(Customer customer){
        Collection<Reservation> reservations = new LinkedList<>();
        return reservations;
    }

    public static void printAllReservations(){
        System.out.println("Call from ReservationService printAllReservation");
    }
}
