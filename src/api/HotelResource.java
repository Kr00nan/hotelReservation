package api;

import model.Customer;
import model.Reservation;
import model.Room;

import java.util.Collection;
import java.util.Date;

public class HotelResource {
    public static Customer getCustomer(String email){
        return service.CustomerService.getCustomer(email);
    }

    public static void createACustomer(String firstName, String lastName, String email) {
        service.CustomerService.addCustomer(firstName, lastName, email);
    }

    public static Room getRoom(String roomNumber){
        return service.ReservationService.getARoom(roomNumber);
    }

    public static Reservation bookARoom(String customerEmail, Room room, Date checkInDate, Date checkOutDate){
        Customer customer = getCustomer(customerEmail);
        Reservation reservation = service.ReservationService.reserveARoom(customer, room, checkInDate, checkOutDate);
        return reservation;
    }

//    public static Collection<Reservation> getCustomersReservations(String customerEmail){
//        service.ReservationService.
//        return reservations;
//    }
}
