package org.sample.string;

public class StringManyMethodTest {

    public static void main(String[] args) {

        String str1 = new String("     Let Me Give You Some Color To See See!");
        System.out.println("str1 = " + str1); //      Let Me Give You Some Color To See See!

        boolean b1 = str1.contains("some");
        System.out.println("b1 = " + b1); // false
        b1 = str1.contains("Some");
        System.out.println("b1 = " + b1); // true

        System.out.println("----------------------------------------------");

        String str2 = str1.toUpperCase();
        System.out.println("str2 = " + str2); //    LET ME GIVE YOU SOME COLOR TO SEE SEE!
        System.out.println("str1 = " + str1); //    Let Me Give You Some Color To See See!

        String str3 = str1.toLowerCase();
        System.out.println("str3 = " + str3); //    let me give you some color to see see!
        System.out.println("str1 = " + str1); //    Let Me Give You Some Color To See See!

        String str4 = str1.trim();
        System.out.println("str4 = " + str4); //Let Me Give You Some Color To See See!

        System.out.println("----------------------------------------------");
        b1 = str1.startsWith("Let");
        System.out.println("b1 = " + b1); // false
        b1 = str1.startsWith(" ");
        System.out.println("b1 = " + b1); // true

        b1 = str1.startsWith("Let", 5);
        System.out.println("b1 = " + b1); // true

        b1 = str1.endsWith("See");
        System.out.println("b1 = " + b1); // false
        b1 = str1.endsWith("See!");
        System.out.println("b1 = " + b1); // true
    }
}
