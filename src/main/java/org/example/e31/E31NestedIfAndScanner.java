package org.example.e31;

import java.util.Scanner;

public class E31NestedIfAndScanner {
    public static void main(String[] args) {
        // Create a Scanner object to read input

        Scanner input = new Scanner(System.in);
// Declare a boolean variable isSunny
        boolean isSunny = true;
        boolean isNotSunny = false;
// Print "Is it sunny outside? (true/false)"
        System.out.println("Is it sunny outside? (true/false)");

        String outside = input.next();
// De
        if (outside.equalsIgnoreCase("true")) {

            System.out.println("It is a sunny day, I should go somewhere!");
            System.out.println("What is the temperature outside?");
            int temp = input.nextInt();
            if (temp > 85) {
                System.out.println("I am going to the beach!");
            } else {
                System.out.println("I am going to the park!");
            }
        } else {
            System.out.println("I stay home and practice Java");
        }


    }
}
