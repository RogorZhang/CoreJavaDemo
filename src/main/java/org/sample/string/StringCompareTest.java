package org.sample.string;

public class StringCompareTest {

    public static void main(String[] args) {
        String str1 = new String("hello");
        System.out.println("str1 = " + str1); // hello

        System.out.println(str1.compareTo("world"));  // 'h' - 'w' => 104 - 119 => -15
        System.out.println(str1.compareTo("haha"));   // 'e' - 'a' => 101 - 97  => 4
        System.out.println(str1.compareTo("hehe"));   // 'l' - 'h' => 108 - 104 => 4
        System.out.println(str1.compareTo("heihei")); // 'l' - 'i' => 108 - 105 => 3
        System.out.println(str1.compareTo("helloworld")); // 长度： 5 - 10 => -5
        System.out.println(str1.compareToIgnoreCase("HELLO")); // 0
    }
}
