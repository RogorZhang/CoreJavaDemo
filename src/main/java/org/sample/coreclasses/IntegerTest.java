package org.sample.coreclasses;

public class IntegerTest {

    public static void main(String[] args) {

        System.out.println("Max value " + Integer.MAX_VALUE); // 2^31-1
        System.out.println("Min value " + Integer.MIN_VALUE); // -2^31
        System.out.println("class " + Integer.TYPE); // int

        System.out.println("------------------------------------------------------");
        Integer it3 = Integer.valueOf(123);
        System.out.println("it3 = " + it3); // 123

        Integer it4 = Integer.valueOf("456");
        System.out.println("it4 = " + it4); // 456

        System.out.println("------------------------------------------------------");
        Integer it5 = 100;
        int ib = it5;

    }
}
