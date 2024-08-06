package org.example.e86;

public class E86ClassAndObject {
    public static void main(String[] args) {
        // Create a class named 'Student'
        Student s1=new Student();
        // Declare a String variable named 'name' and an integer variable named 'roll_no'
        s1.name="John";
        s1.roll_no=2;
        // Create an object of the class 'Student'
        // Assign the value "John" to the 'name' variable
        // Assign the value 2 to the 'roll_no' variable
        // Print the values of 'name' and 'roll_no' in the specified format
        System.out.println("Name is "+s1.name+" and roll number is "+s1.roll_no);

    }
}
