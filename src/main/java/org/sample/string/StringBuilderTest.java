package org.sample.string;

public class StringBuilderTest {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();
        System.out.println("sb1 = " + sb1); // 自动调用toString方法 啥也没有
        System.out.println("length is " + sb1.length()); // 0

        System.out.println("-----------------------------------------------------------");
        StringBuilder sb2 = new StringBuilder(20);
        System.out.println("sb2 = " + sb2);
        System.out.println("capacity is: "  + sb2.capacity()); // 20

        System.out.println("length is " + sb2.length()); // 0

        System.out.println("-----------------------------------------------------------");
        // 3.根据参数指定的字符串内容来构造对象并打印容量和长度
        StringBuilder sb3 = new StringBuilder("hello");
        System.out.println("sb3 = " + sb3);
        System.out.println("capacity is: " + sb3.capacity()); // default 16 + 5
        System.out.println("length is " + sb3.length()); // 5

        System.out.println("-----------------------------------------------------------");
        String str1 = new String("hello");
        String str2 = str1.toUpperCase();
        System.out.println("str2 = " + str2); // HELLO
        System.out.println("str1 = " + str1); // hello


        StringBuilder sb4 = sb3.insert(0, "abcd");
        System.out.println("sb4 = " + sb4); // abcdhello
        System.out.println("sb3 = " + sb3); // abcdhello


        sb3.insert(4, "1234");
        System.out.println("sb3 = " + sb3); // abcd1234hello

        sb3.insert(sb3.length(), "ABCD");
        System.out.println("sb3 = " + sb3); // abcd1234helloABCD

        System.out.println("-----------------------------------------------------------");

        sb3.append("world");
        System.out.println("sb3 = " + sb3); // abcd1234helloABCDworld


        System.out.println("-----------------------------------------------------------");
        sb3.deleteCharAt(8);
        System.out.println("sb3 = " + sb3); // abcd1234elloABCDworld


        System.out.println("-----------------------------------------------------------");

        sb3.delete(0, 4);
        System.out.println("sb3 = " + sb3); // 1234ABCDworld

        sb3.delete(4, 8);
        System.out.println("sb3 = " + sb3); // 1234world


        sb3.delete(4, sb3.length());
        System.out.println("sb3 = " + sb3); // 1234

        System.out.println("-----------------------------------------------------------");

        sb3.setCharAt(0, 'a');
        System.out.println("modify result is " + sb3); // a234


        sb3.replace(1, 4, "bcd");
        System.out.println("modify result is " + sb3); // abcd


        sb3.reverse();
        System.out.println("reverse " + sb3); // dcba

    }
}
