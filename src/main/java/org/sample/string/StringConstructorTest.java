package org.sample.string;

public class StringConstructorTest {

    public static void main(String[] args) {

        String str1 = new String();
        System.out.println("str1 = " + str1); // ""

        System.out.println("----------------------------------------------------");
        // 'a' - 97
        byte[] bArr = {97, 98, 99, 100, 101};
        // 98 - 'b'   99 - 'c'  100 - 'd'   => bcd
        String str2 = new String(bArr, 1, 3);
        System.out.println("str2 = " + str2); // bcd

        String str3 = new String(bArr);
        System.out.println("str3 = " + str3); // abcde

        System.out.println("----------------------------------------------------");
        char[] cArr = {'h', 'e', 'l', 'l', 'o'};
        String str4 = new String(cArr, 2, 2);
        System.out.println("str4 = " + str4); // ll

        String str5 = new String(cArr);
        System.out.println("str5 = " + str5); // hello

        System.out.println("----------------------------------------------------");
        String str6 = new String("world");
        System.out.println("str6 = " + str6); // world
    }
}
