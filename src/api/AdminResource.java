package api;

import model.Customer;
import model.IRoom;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AdminResource {
    public static Customer getCustomer(String email){
        //TODO
        Customer customer = new Customer("test", "account", "test@account.com");
        return customer;
    }

    public static void addRoom(List<IRoom> rooms){
        //TODO
    }

    public static Collection<IRoom> getAllRooms(){
        //TODO
        Collection<IRoom> rooms = new ArrayList<>();
        return rooms;
    }

    public static Collection<Customer> getAllCustomers() {
        return service.CustomerService.getAllCustomers();
    }

    public static void displayAllReservations() {
        service.ReservationService.printAllReservations();
    }
}
