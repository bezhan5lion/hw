package org.example.e73;

import java.util.Scanner;

public class E73Arrays {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);

        // Create an array of integers that will store 5 elements
        int[] x = new int[5];
        // Use a loop to read 5 integers from the user and store them in the array
        for (int i = 0; i < 5; i++) {
            x[i] = sc.nextInt();
        }

        for (int i = 4; i >= 0; i--) {
            System.out.println(x[i]);
        }
        // (Do not print any prompt message for the user)

        // Use another loop to iterate through the array in reverse order and print each value on a new line

    }
}
