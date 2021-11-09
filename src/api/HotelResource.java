package api;

import model.Customer;
import model.Reservation;
import model.Room;

import static service.CustomerService.*;
import static service.ReservationService.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class HotelResource {
    public static Customer retrieveCustomer(String email){
        return getCustomer(email);
    }

    public static void createACustomer(String firstName, String lastName, String email) {
        addCustomer(firstName, lastName, email);
    }

    public static Room getRoom(String roomNumber){
        return getARoom(roomNumber);
    }

    public static Collection<Room> findARoom(Date checkIn, Date checkOut) {
        Collection<Room> rooms = new ArrayList<>();
        return rooms;
    }

    public static Reservation bookARoom(String customerEmail, Room room, Date checkInDate, Date checkOutDate){
        Customer customer = getCustomer(customerEmail);
        Reservation reservation = reserveARoom(customer, room, checkInDate, checkOutDate);
        return reservation;
    }

    public static Collection<Reservation> retrieveCustomersReservations(String customerEmail){
        Customer customer = retrieveCustomer(customerEmail);
        return getCustomerReservations(customer);
    }
}
