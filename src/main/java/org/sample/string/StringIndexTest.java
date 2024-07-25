package org.sample.string;

public class StringIndexTest {

    public static void main(String[] args) {

        String str1 = new String("Good Good Study, Day Day Up!");
        System.out.println("str1 = " + str1); // Good Good Study, Day Day Up!

        // 2.实现字符串中指定字符和字符串的查找功能
        int pos = str1.indexOf('g');
        System.out.println("pos = " + pos); // -1  no g found
        pos = str1.indexOf('G');
        System.out.println("pos = " + pos); // 0   first index


        pos = str1.indexOf('G', 0);
        System.out.println("pos = " + pos); // 0
        pos = str1.indexOf('G', 1);
        System.out.println("pos = " + pos); // 5

        System.out.println("------------------------------------------------------");

        pos = str1.indexOf("day");
        System.out.println("pos = " + pos); // -1
        pos = str1.indexOf("Day");
        System.out.println("pos = " + pos); // 17
        pos = str1.indexOf("Day", 17);
        System.out.println("pos = " + pos); // 17
        pos = str1.indexOf("Day", 18);
        System.out.println("pos = " + pos); // 21

        System.out.println("------------------------------------------------------");
        pos = str1.indexOf("Day");
        while (-1 != pos) {
            System.out.println("pos = " + pos); // 17
            pos = str1.indexOf("Day", pos+1);
        }

        System.out.println("------------------------------------------------------");

        pos = 0;
        while ((pos = str1.indexOf("Day", pos)) != -1) {
            System.out.println("pos = " + pos);
            pos += "Day".length();
        }

        System.out.println("------------------------------------------------------");
        pos = str1.lastIndexOf("Day");
        System.out.println("pos = " + pos); // 21
        pos = str1.lastIndexOf("Day",  21);
        System.out.println("pos = " + pos); // 21
        pos = str1.lastIndexOf("Day", 20);
        System.out.println("pos = " + pos); // 17
        pos = str1.lastIndexOf("Day", 15);
        System.out.println("pos = " + pos); // -1
    }
}
