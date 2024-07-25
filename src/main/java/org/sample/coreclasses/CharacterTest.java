package org.sample.coreclasses;

public class CharacterTest {

    public static void main(String[] args) {

        Character ca1 = Character.valueOf('a');
        System.out.println("ca1 = " + ca1); // a
        char c1 = ca1.charValue();
        System.out.println("c1 = " + c1); // a

        System.out.println("----------------------------------------");
        Character ca2 = 'b';
        char c2 = ca2;
        System.out.println("c2 = " + c2); // b

        System.out.println("----------------------------------------");
        System.out.println(Character.isUpperCase(c2)); // false
        System.out.println(Character.isLowerCase(c2)); // true
        System.out.println(Character.isDigit(c2));     //false
        System.out.println("ToUpper " + Character.toUpperCase(c2)); // B
        System.out.println("ToLower " + Character.toLowerCase(c2)); // b
    }
}
