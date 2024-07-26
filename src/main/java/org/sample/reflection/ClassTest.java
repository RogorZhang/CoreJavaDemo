package org.sample.reflection;

public class ClassTest {

    public static void main(String[] args) throws ClassNotFoundException {

        Class c1 = String.class;
        System.out.println("c1 = " + c1); // toString() class java.lang.String
        c1 = int.class;
        System.out.println("c1 = " + c1); // int
        c1 = void.class;
        System.out.println("c1 = " + c1); // void

        System.out.println("---------------------------------------------------");
        // 2.getClass
        String str1 = new String("hello");
        c1 = str1.getClass();
        System.out.println("c1 = " + c1); // class java.lang.String

        Integer it1 = 20;
        c1 = it1.getClass();
        System.out.println("c1 = " + c1); // class java.lang.Integer

        int num = 5;
        //num.getClass(); Error: can't call getClass for primitive data type

        System.out.println("---------------------------------------------------");
        // 3.use wrap class Type
        c1 = Integer.TYPE;
        System.out.println("c1 = " + c1); // int

        c1 = Integer.class;
        System.out.println("c1 = " + c1); // class java.lang.Integer

        System.out.println("---------------------------------------------------");
        // 4.forName()
        //c1 = Class.forName("String"); // Error  need complete name
        c1 = Class.forName("java.lang.String");
        System.out.println("c1 = " + c1); // class java.lang.String

        c1 = Class.forName("java.util.Date");
        System.out.println("c1 = " + c1); // class java.util.Date

        //c1 = Class.forName("int");
        //System.out.println("c1 = " + c1); // can't get primitive data type class name

        System.out.println("---------------------------------------------------");
        // 5.Class Loader
        ClassLoader classLoader = ClassTest.class.getClassLoader();
        System.out.println("classLoader = " + classLoader); // null
        c1 = classLoader.loadClass("java.lang.String");
        System.out.println("c1 = " + c1); // class java.lang.String
    }
}
