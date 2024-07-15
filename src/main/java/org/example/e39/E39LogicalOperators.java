package org.example.e39;

import java.util.Scanner;

public class E39LogicalOperators {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scan = new Scanner(System.in);

        // Print prompt for user to enter their mark
        System.out.println("Please enter your mark");
        // Capture the mark input
        int mark = scan.nextInt();
        // Determine the grade based on the mark
        if (mark <= 100 && mark >= 1) {
            if (mark >= 81) {
                System.out.println("Your grade is A");
            } else if (mark >= 61) {
                System.out.println("Your grade is B");
            } else if (mark >= 51) {
                System.out.println("Your grade is C");
            } else if (mark >= 46) {
                System.out.println("Your grade is D");
            } else if (mark >= 26) {
                System.out.println("Your grade is E");
            } else {
                System.out.println("Your grade is F");
            }
        } else {
            System.out.println("Please enter valid mark");
        }

        // Print the grade
        // Output: Your grade is ____


    }
}
