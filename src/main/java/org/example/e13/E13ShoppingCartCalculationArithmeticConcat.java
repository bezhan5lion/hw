package org.example.e13;

public class E13ShoppingCartCalculationArithmeticConcat {
    public static void main(String[] args) {
        // Step 1: Declare the float variables and assign values
        float item1 = 45.0f;
        float item2 = 45.0f;
        float item3 = 9.0f;


        // Step 2: Calculate the total cost
        float totalCost = (item1+item2);

        // Step 3: Apply the discount
        float discount = (item3);
        float finalPrice = (totalCost-item3);

        // Step 4: Print the results
        System.out.println("Total Cost: $"+totalCost);
        System.out.println("Discount Amount: $"+discount);
        System.out.println("Final Price: $"+finalPrice);

    }
}
