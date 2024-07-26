package org.sample.collections2;


import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

    public static void main(String[] args) {
        Set<String> s1 = new HashSet<>();
        System.out.println("s1 = " + s1);

        System.out.println("----------------------------------------------------");
        boolean b1 = s1.add("two");
        System.out.println("b1 = " + b1); // true
        System.out.println("s1 = " + s1); // [two]

        b1 = s1.add("one");
        System.out.println("b1 = " + b1); // true
        System.out.println("s1 = " + s1); // [one, two]   [two, one]

        b1 = s1.add("three");
        System.out.println("b1 = " + b1); // true
        System.out.println("s1 = " + s1); // [one, two, three]  [two, one, three]

        b1 = s1.add("one");
        System.out.println("b1 = " + b1); // false
        System.out.println("s1 = " + s1); // [one, two, three] [two, one, three]
    }
}
