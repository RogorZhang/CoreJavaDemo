package org.sample.collections2;

public class PersonTest {

    public static void main(String[] args) {

        Person p1 = new Person("zhangfei", 30, "男");
        System.out.println(p1); // zhangfei 30 男

        System.out.println("-----------------------------------");
        Person<String> p2 = new Person<>();
        p2.setGender("Female");
        System.out.println(p2); // null  0  女

        System.out.println("-----------------------------------");
        Person<Boolean> p3 = new Person<>();
        p3.setGender(true);
        System.out.println(p3); // null 0  true

        System.out.println("-----------------------------------");
        Integer[] arr = {11, 22, 33, 44, 55};
        Person.printArray(arr); // 11 22 33 44 55
    }
}
