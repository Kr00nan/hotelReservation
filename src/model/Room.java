package model;

public class Room implements IRoom {

    protected String roomNumber;
    protected Double price;
    protected RoomType type;

    public Room(String roomNumber, Double price, RoomType enumeration){
        this.roomNumber = roomNumber;
        this.price = price;
        this.type = enumeration;
    }

    public String getRoomNumber() {
        return this.roomNumber;
    }

    public Double getRoomPrice() {
        return this.price;
    }

    public RoomType getRoomType() {
        return this.type;
    }

    public boolean isFree() {
        return Double.compare(this.price, 0.0) <= 0;
    }

    @Override
    public String toString() {
        return String.format("Room Number: %s %s bed Room Price: $%.2f",
                this.roomNumber,
                this.type,
                this.price
        );
    }
}
