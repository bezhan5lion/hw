package org.example.e43;

import java.util.Scanner;

public class E43SwitchStatment {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scan = new Scanner(System.in);
        // Print prompt for user to enter their electricity usage in kWh
        System.out.println("Enter your electricity usage in kWh");
        // Capture the usage input
        int usage = scan.nextInt();
        ;        // Calculate bill using switch statement
        if (usage >=0 && usage<=100){
            double bill=usage*0.12;
            System.out.println("Your electricity bill is $"+bill);
        } else if (usage >=101 && usage<=200) {
            double bill=usage*0.15;
            System.out.println("Your electricity bill is $"+bill);
        }else if (usage >=201 && usage<=300) {
            double bill=usage*0.20;
            System.out.println("Your electricity bill is $"+bill);
        }else if (usage >=301) {
            double bill=usage*0.25;
            System.out.println("Your electricity bill is $"+bill);
        }else {
            System.out.println("Invalid usage entered");
        }


        // Print the bill
        // Output: Your electricity bill is $____
    }
}
