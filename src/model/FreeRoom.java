package model;

public class FreeRoom extends Room {

    public FreeRoom(String room, RoomType enumeration) {
        super(room, 0.0, enumeration);
    }

    @Override
    public String toString() {
        return String.format("Room Number: %s %s bed Room Price: free",
                this.roomNumber,
                this.type
        );
    }
}
