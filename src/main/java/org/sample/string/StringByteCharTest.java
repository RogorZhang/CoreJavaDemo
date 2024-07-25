package org.sample.string;

public class StringByteCharTest {

    public static void main(String[] args) {

        String str1 = new String("world");
        System.out.println("str1 = " + str1); // world

        System.out.println("-----------------------------------------------");
        byte[] bArr = str1.getBytes();
        for (int i = 0; i < bArr.length; i++) {
            System.out.println("index i value: " + bArr[i]);
        }

        // bytes to string
        String str2 = new String(bArr);
        System.out.println("bytes to string " + str2); // world

        System.out.println("-----------------------------------------------");
        //string to char array
        char[] cArr = str1.toCharArray();
        for (int i = 0; i < cArr.length; i++) {
            System.out.println("index " + i + " char is " + cArr[i]);
        }

        //chars to string
        String str3 = new String(cArr);
        System.out.println("chars to string " + str3); // world
    }
}
