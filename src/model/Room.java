package model;

public class Room implements IRoom {

    protected String roomNumber;
    protected Double price;
    protected RoomType enumeration;

    public String getRoomNumber() {
        return roomNumber;
    }

    public Double getRoomPrice() {
        return price;
    }

    public RoomType getRoomType() {
        return enumeration;
    }

    public boolean isFree() {
        return false;
    }

    @Override
    public String toString() {
        return "FROM ROOM CLASS: Insert Better Description";
    }
}
