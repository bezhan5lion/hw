package org.example.e45;

import java.util.Scanner;

public class E45SwitchClass {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scan = new Scanner(System.in);
        // Print prompt for user to enter the type of coffee (1 for Espresso, 2 for Latte, 3 for Cappuccino, 4 for Mocha)
        System.out.println("Enter the type of coffee (1 for Espresso, 2 for Latte, 3 for Cappuccino, 4 for Mocha)");
        // Capture the coffee type input
        int coffeeType = scan.nextInt();
        double espresso = 3;
        double latte = 4;
        double cappuccino = 4.5;
        double mocha = 5;

        switch (coffeeType) {
            case (1):
                System.out.println("The price of your coffee is $" + espresso);
                break;
            case (2):
                System.out.println("The price of your coffee is $" + latte);
                break;
            case (3):
                System.out.println("The price of your coffee is $" + cappuccino);
                break;
            case (4):
                System.out.println("The price of your coffee is $" + mocha);
                break;
            default:
                System.out.println("Invalid coffee type entered");
        }
        // Print the price
        // Output: The price of your coffee is $____
    }
}
