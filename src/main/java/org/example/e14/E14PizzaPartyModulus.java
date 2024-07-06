package org.example.e14;

public class E14PizzaPartyModulus {
    public static void main(String[] args) {
        // Declare the int variables and assign values
            int totalSlices= 22;
            int friends=7;

        // Calculate slices per person
            int slicesPerPerson= totalSlices/friends;
            int leftoverSlices = 22 % slicesPerPerson;

        // Print the results
        System.out.println("Each person gets "+slicesPerPerson+" slices.");
        System.out.println("There are "+leftoverSlices+" slices left over.");
    }
}
