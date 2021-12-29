package ui;

public class MainMenu {

    String input;

    public static void main(String[] args) {
        // read input from user
//        System.in.read();
        // while input isn't 5, run the menu
        new MainMenu().menu();
    }

    public void menu() {
        System.out.println("\nWelcome to the Hotel Reservation Application");
        System.out.println("---------------------------");
        System.out.println("1. Find and reserve a room");
        System.out.println("2. See my reservations");
        System.out.println("3. Create an Account");
        System.out.println("4. Admin");
        System.out.println("5. Exit");
        System.out.println("---------------------------");
        System.out.println("Please select a number for the menu option");
    }

    public void admin() {
        System.out.println("\nAdmin Menu");
        System.out.println("---------------------------");
        System.out.println("1. See all Customers");
        System.out.println("2. See all Rooms");
        System.out.println("3. See all Reservations");
        System.out.println("4. Add a Room");
        System.out.println("5. Add Test Data");
        System.out.println("5. Back to Main Menu");
        System.out.println("---------------------------");
        System.out.println("Please select a number for the menu option");
    }
}
