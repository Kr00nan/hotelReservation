package model;

import java.util.Date;

public class Reservation {
    private Customer customer;
    private IRoom room;
    private Date checkInDate;
    private Date checkOutDate;

    @Override
    public String toString() {
        return String.format("%s, you've reserved room %s. Checking in on %s and checking out on %s.", customer.getFirstName(), room.getRoomNumber(), checkInDate, checkOutDate);
    }
}
