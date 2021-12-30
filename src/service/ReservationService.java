package service;

import model.*;

import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;

public class ReservationService {

    private static Collection<IRoom> reservations = new LinkedList<>();

    public void addRoom(Room room){
        //TODO
    }

    public static IRoom getARoom(String roomID){
        //TODO
    }

    public static Reservation reserveARoom(Customer customer, IRoom room, Date checkInDate, Date checkOutDate){
        //TODO
    }

    public static Collection<IRoom> findRooms(Date checkInDate, Date checkOutDate){
        //TODO
    }

    public static Collection<Reservation> getCustomerReservations(Customer customer){
        //TODO
    }

    public static void printAllReservations(){
        System.out.println(reservations);
    }
}
