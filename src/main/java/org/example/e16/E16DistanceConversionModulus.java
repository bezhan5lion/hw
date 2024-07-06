package org.example.e16;

public class E16DistanceConversionModulus {
    public static void main(String[] args) {
        // Declare the int variable and assign a value
        int totalMeters = 1850;
        int kiloMeters = totalMeters/1000;
        int reminders = totalMeters % 1000;

        int meters = totalMeters - kiloMeters;
        // Calculate kilometers and meters
        System.out.println("1850 meters is equal to "+kiloMeters+" kilometers and "+reminders+" meters.");

        // Print the results

    }
}
