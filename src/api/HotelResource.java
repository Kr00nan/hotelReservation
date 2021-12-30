package api;

import model.Customer;
import model.IRoom;
import model.Reservation;
import model.Room;
import service.CustomerService;

import static service.CustomerService.*;
import static service.ReservationService.*;

import java.util.Collection;
import java.util.Date;
import java.util.regex.Pattern;

public class HotelResource {
    public static Customer retrieveCustomer(String email){
        return getCustomer(email);
    }

    public static void createACustomer(String firstName, String lastName, String email) {
        //TODO
        String emailRegex = "^(.+)@(.+).(.+)$";
        Pattern pattern = Pattern.compile(emailRegex);

        // check to make sure email format is legit
        if (pattern.matcher(email).matches()) {
            CustomerService.addCustomer(firstName, lastName, email);
        } else {
            throw new IllegalArgumentException("Email format incorrect; required format: xxx@xxx.xxx");
        }
    }

    public static IRoom getRoom(String roomNumber){
        //TODO
    }

    public static Collection<Room> findARoom(Date checkIn, Date checkOut) {
        //TODO
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
