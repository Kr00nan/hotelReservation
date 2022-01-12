package service;

import model.*;
import java.util.*;

public class ReservationService {

    private static Collection<IRoom> rooms = new LinkedList<>();
    private static Collection<Reservation> reservations = new LinkedList<>();

    public static void addRoom(Room room){
        rooms.add(room);
    }

    public static IRoom getARoom(String roomID){
        IRoom room = null;
        try {
            for(IRoom theOne : rooms) {
                if (theOne.getRoomNumber().equals(roomID)) {
                    room = theOne;
                    break;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return room;
    }

    public static Reservation reserveARoom(Customer customer, IRoom room, Date checkInDate, Date checkOutDate){
        Reservation reservation = new Reservation(customer, room, checkInDate, checkOutDate);
        reservations.add(reservation);
        return reservation;
    }

    public static Collection<IRoom> findRooms(Date checkInDate, Date checkOutDate){
        Collection<IRoom> availableRooms = new LinkedList<>();
        // am I comparing Dates or Calendar objects?
        for (Reservation reservation : reservations) {
            // if checkInDate and checkOutDate are before reservation.checkInDate, add room to list
            if (checkOutDate.before(reservation.getCheckInDate()) && checkInDate.before(reservation.getCheckInDate())) {
                availableRooms.add(reservation.getRoom());
            }
            // if checkInDate and checkOutDate are after reservation.checkOutDate, add room to list
            if (checkInDate.after(reservation.getCheckOutDate()) )
        }

        if (availableRooms.isEmpty()) {
            // turn checkInDate and checkOutDate into calendar instances
            // add 7 days to both checkInDate and checkOutDate
            // run for loop again (turn this into a private method?)
        }
        return availableRooms;
    }

    public static Collection<Reservation> getCustomerReservations(Customer customer){
        Collection customerReservations = new LinkedList();
        try {
            for(Reservation reservation : reservations) {
                if (reservation.getCustomer().equals(customer)) {
                    customerReservations.add(reservation);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("There are no reservations for this customer.");
        }
        return customerReservations;
    }

    public static void printAllReservations(){
        System.out.println(reservations);
    }
}
