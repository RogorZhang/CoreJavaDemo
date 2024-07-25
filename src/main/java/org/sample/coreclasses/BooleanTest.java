package org.sample.coreclasses;

public class BooleanTest {

    public static void main(String[] args) {

        Boolean bo1 = Boolean.valueOf(true);
        System.out.println("bo1 = " + bo1); // true
        boolean b1 = bo1.booleanValue();
        System.out.println("b1 = " + b1); // true

        System.out.println("----------------------------------------------");
        Boolean bo2 = false;
        boolean b2 = bo2;
        System.out.println("b2 = " + b2); // false

        System.out.println("----------------------------------------------");
        boolean b3 = Boolean.parseBoolean("TRUE");
        System.out.println("b3 = " + b3); // true
    }
}
