package org.example.e19;

public class E19ActivityTimeTrackerTypeCasting {
    public static void main(String[] args) {
        // Declare the double variables and assign values
        double time1=45.5;
        double time2=30.2;
        double time3=60.7;

        // Calculate total time
        double totalTime=time1+time2+time3;

        // Type cast the total time to an int to get total minutes
        int totalMinutes=(int)totalTime;

        // Calculate hours and remaining minutes
        int hours =totalMinutes/60;
        int remainingMinutes= totalMinutes % 60;

        // Print the results
        System.out.println("The original total time is "+totalTime+" minutes.");
        System.out.println("The converted time is "+hours+" hours and "+remainingMinutes+" minutes.");
    }
}
