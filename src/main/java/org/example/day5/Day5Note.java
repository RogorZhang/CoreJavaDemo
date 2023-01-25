package org.example.day5;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Day5Note {
/*
CompletableFuture: Future and CompletionState
    sync and async

    without any return
        System.out.println("main thread starts");
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            try {
                System.out.println("child thread starts working");
                Thread.sleep(5000);
                System.out.println("child thread done");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        future.get();
        System.out.println("main thread ends");


    with return
        System.out.println("main thread starts");
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println("child thread starts working");
                Thread.sleep(3000);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            return "child thread is done";
        });

        System.out.println("task result: " + future.get());
        System.out.println("main thread ends");

    chain operations
        System.out.println("main thread starts");

        CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> {
            System.out.println("start adding 50 to number");
            num += 50;
            return num;
        }).thenApply(val -> {
            return val * 2;
        }).thenApplyAsync(val -> val + 100).thenAccept(val -> {
            System.out.println("this is the last step from mian thread");
            System.out.println("result: " + (val - 1));
        });

        System.out.println("task result: " + future.get());
        System.out.println("main thread ends");

    exception
        System.out.println("main thread starts");

        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            int result = 1 / 0;
            System.out.println("add 10 to num");
            num += 10;
            return num;
        }).exceptionally(ex -> {
            System.out.println(ex.getMessage());
            return 404;
        });

        System.out.println("task result: " + future.get());
        System.out.println("main thread ends");

        -------------------------

        System.out.println("main thread starts");
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
//            int result = 1 / 0;
            System.out.println("add 10 to num");
            num += 10;
            return num;
        }).handle((values, exception) -> {
            System.out.println("get into the handle method");
            if (exception == null) {
                values += 10;
                System.out.println("task is done");
                return values;
            } else {
                System.out.println("exception thrown" + exception.getMessage());
                return 400;
            }
        });
        System.out.println("task result: " + future.get());
        System.out.println("main thread ends");

        thenCompose, thenCombine
        allOf, anyOf

Lock
    parallel vs concurrent

    Lock:
        synchronized code block/ method/ static method/ class
        Lock interface: ReentrantLock: lock(), unlock(), tryLock(), newCondition()...
        ReadWriteLock interface: ReentrantReadWriteLock
            Lock readLock();
            Lock writeLock();

            class MyClass {
                public void method() {
                    synchronized (MyClass.class) {
                        // TODO
                    }
                }

                public synchronized void method1() {

                }

                public synchronized static void method2() {

                }

                public void method3(){
                    synchronized (this) {

                    }
                }
            }

Dead Lock
      two or more threads are waiting for each other
      how to prevent deadlock
        avoid nested locks
        avoid unnecessary lock
            Stack, Vector, HashTable
        Use Thread join()
 */


    public static void main(String[] args) throws ExecutionException, InterruptedException {




    }
}




