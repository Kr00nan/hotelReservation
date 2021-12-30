package ui;

public class AdminMenu {
    public static void main(String[] args) {
        new AdminMenu().menu();
    }
    public void menu() {
        System.out.println("\nAdmin Menu");
        System.out.println("---------------------------");
        System.out.println("1. See all Customers");
        System.out.println("2. See all Rooms");
        System.out.println("3. See all Reservations");
        System.out.println("4. Add a Room");
        System.out.println("5. Back to Main Menu");
        System.out.println("---------------------------");
        System.out.println("Please select a number for the menu option");
    }
}
