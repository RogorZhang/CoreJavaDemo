package org.sample.string;

public class StringExamTest {

    public static void main(String[] args) {

        //1. how many objects crated? where they store?
        //String str1 = "hello";  // 1 object  Constant Pool
        //String str1 = new String("helo"); // 2 objects  1 Constant Pool，1 heap

        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");
        String str4 = new String("hello");

        System.out.println(str1 == str2);       // address  true
        System.out.println(str1.equals(str2));  // value  true
        System.out.println(str3 == str4);       // address  false
        System.out.println(str3.equals(str4));  // value  true
        System.out.println(str2 == str4);       // address  false
        System.out.println(str2.equals(str4));  // value true

        System.out.println("------------------------------------------------------------");


        String str5 = "abcd";
        String str6 = "ab" + "cd";
        System.out.println(str5 == str6); // 比较地址  true

        String str7 = "ab";
        String str8 = str7 + "cd"; // 没有常量优化
        System.out.println(str5 == str8); // 比较地址 false


    }
}
