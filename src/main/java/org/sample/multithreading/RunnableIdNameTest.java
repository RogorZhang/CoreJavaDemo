package org.sample.multithreading;

public class RunnableIdNameTest implements Runnable {
    @Override
    public void run() {
        //get current thread ref
        Thread t1 = Thread.currentThread();
        System.out.println("sub thread id is: " + t1.getId() + ", name is " + t1.getName()); // 14 guanyu
        t1.setName("zhangfei");
        System.out.println("modified thread id is: " + t1.getId() + ", name is " + t1.getName()); // 14 zhangfei
    }

    public static void main(String[] args) {

        RunnableIdNameTest rint = new RunnableIdNameTest();
        //Thread t2 = new Thread(rint);
        Thread t2 = new Thread(rint, "guanyu");
        t2.start();

        Thread t1 = Thread.currentThread();
        System.out.println("Main Thread id is: " + t1.getId() + ", name is " + t1.getName());
    }
}
