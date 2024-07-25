package org.sample.string;

public class StringRegMethodTest {

    public static void main(String[] args) {

        String str1 = "1001,zhangfei,30";
        System.out.println("str1 = " + str1); // 1001,zhangfei,30

        String[] sArr = str1.split(",");
        for (int i = 0; i < sArr.length; i++) {
            System.out.println("index " + i + " 's string is " + sArr[i]); // 1001 zhangfei 30
        }

        System.out.println("--------------------------------------------------------------");



        System.out.println("--------------------------------------------------------------");
        String str6 = "123abc456def789ghi";

        String str7 = str6.replaceFirst("\\d+", "#");
        System.out.println("str7 " + str7); // #abc456def789ghi

        String str8 = str7.replaceAll("[a-z]+", "A");
        System.out.println("str8 = " + str8); // #A456A789A

    }
}
