package org.sample.collections2;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

    public static void main(String[] args) {

        Set<String> s1 = new TreeSet<>();
        System.out.println("s1 = " + s1); // [啥也没有]

        boolean b1 = s1.add("aa");
        System.out.println("b1 = " + b1); // true
        System.out.println("s1 = " + s1); // [aa]

        b1 = s1.add("cc");
        System.out.println("b1 = " + b1); // true
        System.out.println("s1 = " + s1); // [aa, cc]

        b1 = s1.add("bb");
        System.out.println("b1 = " + b1); // true
        //TreeSet has order
        System.out.println("s1 = " + s1); // [aa, bb, cc]

        System.out.println("----------------------------------------------------------");
        Comparator<Student> comparator = (Student o1, Student o2) -> { return o1.getAge() - o2.getAge(); };

        Set<Student> s2 = new TreeSet<>(comparator);
        s2.add(new Student("zhangfei", 35));
        s2.add(new Student("zhangfei", 30));
        s2.add(new Student("guanyu", 35));
        s2.add(new Student("liubei", 40));
        System.out.println("s2 = " + s2);
    }
}
