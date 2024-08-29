package org.example.e118;

public class E118JavaMethods {

    String spaceOut(String word){
        for (int i = 0; i < word.length(); i++) {
            System.out.print(word.charAt(i)+" ");
        }
        return word;
    }
    public static void main(String[] args) {
        // Students will write the code here.
    E118JavaMethods str=new E118JavaMethods();


        str.spaceOut("technology");
    }
}

