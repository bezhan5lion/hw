package org.example.e12;

public class E12CalculateCostArithmeticConcat {
    public static void main(String[] args) {
        // Declare the float variables and assign values
        float a = 15.95f;
        float b = 19.59f;
        float c = 23.69f;
        float d = 16.75f;

        float totalCost = (a+b+c+d);
        float averageCost = (totalCost/4);

        // Calculate the total cost
        System.out.println("The total cost is " + totalCost);
        // Calculate the average cost
        System.out.println("The average cost is " + averageCost);
        // Print the results
      //  System.out.println("The total cost is " + totalCost);
        //System.out.println("The average cost is " + averageCost);
    }
}
