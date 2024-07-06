package org.example.e15;

public class E15TimeConversionModulus {
    public static void main(String[] args) {
        // Declare the int variable and assign a value

        int minutes = 125;
        int hour = minutes/60;

        int totalHour = hour;
        int reminder = minutes-totalHour * 60;
        // Calculate hours and minutes
        System.out.println("125 minutes is equal to "+totalHour+" hours and "+reminder+" minutes.");

        // Print the results
    }
}

