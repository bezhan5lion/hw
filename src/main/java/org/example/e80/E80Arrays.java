package org.example.e80;

public class E80Arrays {
    public static void main(String[] args) {
        // Declare and initialize the 2D array with the given values
        int[][] a = {
                {-5, -2, -3, 7},
                {1, -5, -3, 2},
                {1, -2, 3, -4}
        };
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length[0]; j++) {
                if (a[i][j]%2==1)
                    sum=a[i][j];
                }
            }
        System.out.println(sum);
        // Use nested loops to iterate through the 2D array and count the elements that are both negative and odd

        // Print the total count of elements that are both negative and odd
    }
}
