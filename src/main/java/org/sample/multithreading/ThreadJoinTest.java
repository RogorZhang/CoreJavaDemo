package org.sample.multithreading;

public class ThreadJoinTest extends Thread {
    @Override
    public void run() {
        System.out.println("Count Start..");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread done!");
    }

    public static void main(String[] args) {

        ThreadJoinTest tjt = new ThreadJoinTest();
        tjt.start();

        // Main Thread wait
        System.out.println("Main Thread waiting...");
        try {
            tjt.join(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
