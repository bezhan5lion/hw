package org.example.e103;

import java.util.Scanner;

public class E103StringManipulations {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.println("In:");

        String input= sc.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char l=input.charAt(i);
            String s = Character.toString(l);
            System.out.print(s+" ");
        }
        System.out.println();
    }
}
