package ui;

import java.util.Scanner;

public class MainMenu {

    String input;
    Scanner scanner;

    public static void main(String[] args) {
        // read input from user
        // System.in.read();
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
        try {
            System.out.println("Please select a number for the menu option");
            scanner = new Scanner(System.in);
            input = scanner.nextLine();
        } catch (Exception ex) { ex.getLocalizedMessage(); }
        finally {
            scanner.close();
        }

    }
}
