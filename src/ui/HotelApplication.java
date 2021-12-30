package ui;

public class HotelApplication {
    public static void main(String[] args) {
        new HotelApplication().go();
    }

    public void go(){
        new MainMenu().menu();
    }
}
