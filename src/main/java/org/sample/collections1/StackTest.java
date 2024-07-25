package org.sample.collections1;


import java.util.Stack;

public class StackTest {

    public static void main(String[] args) {

        // 1.准备一个Stack类型的对象并打印
        Stack s1 = new Stack();
        Stack s2 = new Stack();
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);

        System.out.println("-----------------------------------------------");


        for (int i = 1; i <= 5; i++) {
            Object obj = s1.push(i * 11);
            System.out.println("value push to stack " + obj);

        }

        System.out.println("s1 values " + s1); // 11 22 33 44 55

        System.out.println("-----------------------------------------------");
        Object obj2 = s1.peek();
        System.out.println("head value in stack " + obj2); // 55

        System.out.println("-----------------------------------------------");
        int len = s1.size();
        for (int i = 1; i <= len; i++) {
            Object to = s1.pop();
            s2.push(to);
        }

        System.out.println("-----------------------------------------------");

        System.out.println("-----------------------------------------------");
        len = s2.size();
        for (int i = 1; i <= len; i++) {
            Object to = s2.pop();
            System.out.println("out stack value is " + to); // 11 22 33 44 55
        }
    }
}
