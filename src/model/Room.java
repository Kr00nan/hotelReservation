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

    public Room() {
        
    }

    public void setRoomNumber(String roomNumber){
        this.roomNumber = roomNumber;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setRoomType(RoomType type){
        this.type = type;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public Double getRoomPrice() {
        return price;
    }

    public RoomType getRoomType() {
        return type;
    }

    public boolean isFree() {
        return false;
    }

    @Override
    public String toString() {
        return String.format("Number: %s\nPrice: %s\nType: %s\nFree: %s\n",
                roomNumber,
                price,
                type,
                isFree());
    }
}
