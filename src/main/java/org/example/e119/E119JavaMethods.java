package org.example.e119;

public class E119JavaMethods {
    static String str="computer science";
    public static String censerLetter(String str, char symbol){
        str=str.replace(symbol,'*');
        return str;
    }
    public static void main(String[] args) {

        // Students will write the code here.
        E119JavaMethods censor=new E119JavaMethods();
        String newStr;
        newStr=censerLetter(str,'e');
        System.out.println(newStr);

        E119JavaMethods censor2=new E119JavaMethods();
        String newStr2;
        newStr2=censerLetter("trick or treat",'t');
        System.out.println(newStr2);
    }

}
