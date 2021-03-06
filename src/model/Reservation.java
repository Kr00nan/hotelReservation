package model;

import java.util.Date;

public class Reservation {
    private Customer customer;
    private IRoom room;
    private Date checkInDate;
    private Date checkOutDate;

    public Reservation(Customer customer, IRoom room, Date checkInDate, Date checkOutDate) {
        this.customer = customer;
        this.room = room;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public Date getCheckInDate() {
        return this.checkInDate;
    }

    public Date getCheckOutDate() {
        return this.checkOutDate;
    }

    public IRoom getRoom() {
        return this.room;
    }

    @Override
    public String toString() {
        return String.format("%s, you've reserved room #%s.\nChecking in on %s and checking out on %s.\nPrice per night: $%.2f", customer.getFirstName(), room.getRoomNumber(), checkInDate, checkOutDate, room.getRoomPrice());
    }
}
