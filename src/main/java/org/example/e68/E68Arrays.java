package org.example.e68;

public class E68Arrays {
    public static void main(String[] args) {
        // Create an array of characters and store the values 's', 'a', 'y', 'b', 'n', 'c', 't', 'd', 'a', 'e', 'x'
        char [] characters={'s', 'a', 'y', 'b', 'n', 'c', 't', 'd', 'a', 'e', 'x'};

        // Print the characters at the indices that form the word "syntax"
        for (int i = 0; i < characters.length; i++) {

            if (i%2==0){
                System.out.print(characters[i]);
            }
        }
    }
}
