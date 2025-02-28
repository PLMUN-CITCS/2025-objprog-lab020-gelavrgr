// File Name: MenuDrivenProgram.java

import java.util.Scanner;

public class MenuDrivenProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Loop to continuously display the menu until the user chooses to exit
        do {
            displayMenu();
            choice = scanner.nextInt();
            handleMenuChoice(choice);
        } while (choice != 3); // Continue until the user chooses to exit

        scanner.close(); // Close the scanner
    }

    /**
     * This method displays the menu options to the user.
     */
    public static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Greet User");
        System.out.println("2. Check Even/Odd");
        System.out.println("3. Exit");
        System.out.print("Enter your choice (1-3): ");
    }

    /**
     * This method executes the corresponding action based on the user's menu choice.
     * @param choice the user's choice
     */
    public static void handleMenuChoice(int choice) {
        switch (choice) {
            case 1:
                greetUser ();
                break;
            case 2:
                checkEvenOrOdd();
                break;
            case 3:
                System.out.println("Exiting program. Goodbye!");
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 3.");
        }
    }

    /**
     * This method displays a greeting message to the user.
     */
    public static void greetUser () {
        System.out.println("Hello! Welcome!");
    }

    /**
     * This method gets an integer input from the user and checks if it's even or odd.
     */
    public static void checkEvenOrOdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        if (number % 2 == 0) {
            System.out.println(number + " is an Even number.");
        } else {
            System.out.println(number + " is an Odd number.");
        }
    }
}
