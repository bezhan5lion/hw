package org.example.e25;

public class E25DailyExpenseTrackerIfConditions {
    public static void main(String[] args) {
        // Assign values to daily expenses
        double morningExpense= 33.25;
        double afternoonExpense= 21;
        double dinnerExpense=22;

        // Calculate total expense
        double totalExpense=morningExpense+afternoonExpense+dinnerExpense;

        // Define a budget
        double budget = 100;

        // Check if within budget
        System.out.println("Your total daily expense is: "+totalExpense);
        if (budget >=totalExpense){
            System.out.println("You are within the budget.");
        }else {
            System.out.println("You are not within the budget");
        }

    }
}
