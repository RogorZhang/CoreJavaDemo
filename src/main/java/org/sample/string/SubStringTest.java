package org.sample.string;

import java.util.Scanner;

public class SubStringTest {

    public static void main(String[] args) {
        String str1 = new String("Happy Wife, Happy Life!");
        System.out.println("str1 = " + str1); // Happy Wife, Happy Life!

        String str2 = str1.substring(12);
        System.out.println("str2 = " + str2); // Happy Life!

        String str3 = str1.substring(6, 10);
        System.out.println("str3 = " + str3); // Wife

    }
}
