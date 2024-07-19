package org.example.e35;

import java.util.Scanner;

public class E35LogicalOperators {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scan=new Scanner(System.in);
        // Print prompt for user to answer if they need a loan
        System.out.println("Do you need a loan? (true/false)");
        // Capture the loan requirement input
        boolean needLoan = scan.nextBoolean();

        if (needLoan){
            System.out.println("What is your credit score?");
            int creditScore =scan.nextInt();
            if (creditScore <= 600) {
                System.out.println("The eligibility is Not eligible");
            } else if (creditScore <=700) {
                System.out.println("The eligibility is Maybe eligible");
            } else if (creditScore <=800) {
                System.out.println("The eligibility is Eligible");
            } else if (creditScore >=801) {
                System.out.println("The eligibility is Definitely eligible");
            }

        }else {
            System.out.println("The eligibility is Unknown");
        }




    }
}
