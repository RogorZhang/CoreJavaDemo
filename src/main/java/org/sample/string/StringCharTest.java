package org.sample.string;

public class StringCharTest {

    public static void main(String[] args) {

        String str1 = new String("hello");
        System.out.println("str1 = " + str1); // hello

        System.out.println("str1 length is " + str1.length()); // 5
        System.out.println("index 0 char " + str1.charAt(0)); // h
        System.out.println("index 4 char  " + str1.charAt(4)); // o
        //System.out.println("index 5 char " + str1.charAt(5)); // StringIndexOutOfBoundsException

        System.out.println("----------------------------------------------");
        for (int i = 0; i < str1.length(); i++) {
            System.out.println("index " + i + " 's char is " + str1.charAt(i)); // h e l l o
        }

        System.out.println("----------------------------------------------");

        System.out.println(str1.isEmpty()? "String is empty ": " Not empty");     // Not empty

        System.out.println("----------------------------------------------");
        // String to int
        String str2 = new String("12345");


        int ia = Integer.parseInt(str2);
        System.out.println("" + ia); // 12345

        System.out.println("----------------------------------------------");
        // int to string
        String str3 = String.valueOf(54321);
        System.out.println("str3 = " + str3); // 54321
    }
}
