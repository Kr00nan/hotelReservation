package model;

public class FreeRoom extends Room {

    public FreeRoom() {
        super();
        this.price = 0.0;
    }

    @Override
    public boolean isFree() {
        return true;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
