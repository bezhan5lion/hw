package org.example.e99;

import java.util.Scanner;

public class E99StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);
        // Prompt the user to input a string
        System.out.println("Please enter a string:");

        // Read the input string
        String input = sc.nextLine();

        // Remove all spaces and convert the string to lowercase
        String str = input;

        String original=input.replaceAll(" ", "").toLowerCase();
        // Check if the string is a palindrome
        StringBuilder str1 = new StringBuilder(original);
            str1.reverse();
        System.out.println(original);
        System.out.println(str1);
        boolean cond = str1.equals(str);
            if (cond){
                System.out.println(true);
            }else {
                System.out.println(false);
            }

        // Print "true" if the string is a palindrome, and "false" otherwise


        // Step 2: Create a Scanner object to read input from the console


    }
}
