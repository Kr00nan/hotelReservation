package service;

import model.Customer;
import model.Room;
import model.Reservation;

import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;

public class ReservationService {

    Collection<Room> rooms = new LinkedList<>();

    public void addRoom(Room room){

    }

    public static Room getARoom(String roomNumber){
        Room room = new Room();
        return room;
    }

    public static Reservation reserveARoom(Customer customer, Room room, Date checkInDate, Date checkOutDate){
        Reservation reservation = new Reservation();
        return reservation;
    }

    public static Collection<Room> findRooms(Date checkInDate, Date checkOutDate){
        Collection<Room> rooms = new LinkedList<>();
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
