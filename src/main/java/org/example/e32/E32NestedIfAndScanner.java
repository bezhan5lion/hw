package org.example.e32;

import java.util.Scanner;

import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Scanner;

public class E32NestedIfAndScanner {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your gender: M or F");
        // Print prompt for user to enter gender
        // Capture the gender input
        String gender = scan.next();
        // Print prompt for user to enter age
        System.out.println("Please enter your age");
        // Capture the age input
        int age = scan.nextInt();

        if (age > 25) {
            if (gender.equalsIgnoreCase("f")) {
                System.out.println("Woman");
            } else {
                System.out.println("Man");
            }

        } else {
            if (gender.equalsIgnoreCase("f")) {
                System.out.println("Girl");
            } else {
                System.out.println("Boy");
            }
        }

    }
}
