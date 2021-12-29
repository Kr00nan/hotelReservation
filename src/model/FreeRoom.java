package model;

public class FreeRoom extends Room {

    public FreeRoom(String r, RoomType e) {
        super(r, 0.0, e);
    }

    @Override
    public String toString() {
        return String.format("Room Number: %s %s bed Room Price: free",
                this.roomNumber,
                this.type
        );
    }
}
