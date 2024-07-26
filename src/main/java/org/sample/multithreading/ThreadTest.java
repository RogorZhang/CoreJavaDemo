package org.sample.multithreading;

public class ThreadTest {

    public static void main(String[] args) {
        Thread t1 = new Thread();
        // 2.call run method
        // do nothing
        t1.run();

        System.out.println("do nothing!");
    }
}
