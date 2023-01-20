package org.example.day4;

import java.util.*;
import java.util.concurrent.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Day4Note {
/*

1。 Stream API
    java.util.stream package
        intermediate operation
            filter, map, flatmap, distinct, limit
        terminal operation
            collect, forEach, reduce, min, max...

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 2, 4, 5));  // 2 3 4 5 3 5 6 -> even 2 4 6
        List<Integer> res = list.stream().map(e -> e + 1).filter(e -> e % 2 == 0).collect(Collectors.toList());
        System.out.println(res);

        Character[] array = new Character[] {'a', 'a', 'b', 'c'};
        Map<Character, Integer> map = Arrays.stream(array).collect(Collectors.toMap(c -> c, c-> 1, (a, b)-> a+b));
        Map<Character, Integer> map = Arrays.stream(array).collect(Collectors.groupingBy(c-> c, Collectors.summingInt(e -> 1)));


2, Multi-threading
    Thread vs Process
        Thread: independent stack, PC register
        Process: independent memory space, stack, heap, os resources

    thread state
        new, runnable, blocked, waiting, timed_waiting, terminated

    how to create thread
        extends Thread
        implements Runnable interface
        implements Callable interface
        thread pool

        Runnable vs Callable
            runnable: run, no return, no exception
            callable: call, has return, has exception


                class MyThread extends Thread {
                    @Override
                    public void run() {
                        System.out.println(Thread.currentThread().getName() + " thread is created by extending Thread Class");
                    }
                }

                class RunnableThread implements Runnable {

                    @Override
                    public void run() {
                        System.out.println(Thread.currentThread().getName() + " thread is created by implementing Runnable interface");
                    }
                }

                class CallableThread implements Callable {

                    @Override
                    public Integer call() throws Exception {
                        System.out.println(Thread.currentThread().getName() + " thread is created by implementing Callable interface");
                        return 123;
                    }
                }

        ThreadPool
            Customized ThreadPool params: ThreadPoolExecutor: corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue, threadFactory, handler

            ExecutorService threadPool = new ThreadPoolExecutor(
                        2,
                        5,
                        2L,
                        TimeUnit.SECONDS,
                        new ArrayBlockingQueue<>(4),
                        Executors.defaultThreadFactory(),
                        new ThreadPoolExecutor.DiscardOldestPolicy()
                );

                for (int i=1; i<=10; i++) {
                    int finalI = i;
                    threadPool.execute(() -> {
                        System.out.println(Thread.currentThread().getName() + " is working on " + finalI + " task");
                    });
                }
                threadPool.shutdown();

            Predefined Thread pool
                - newFixedThreadPool
                - newSingleThreadPool
                - newCachedThreadPool
                - newScheduleThreadPool

                ExecutorService tp1 = Executors.newFixedThreadPool(2);
                ExecutorService tp2 = Executors.newSingleThreadExecutor();
                ExecutorService tp3 = Executors.newCachedThreadPool();
                Executors.newScheduledThreadPool(3);

                OOM: out of memory error



 */


    public static void main(String[] args)  {
        ExecutorService tp1 = Executors.newFixedThreadPool(2);
        ExecutorService tp2 = Executors.newSingleThreadExecutor();
        ExecutorService tp3 = Executors.newCachedThreadPool();
        Executors.newScheduledThreadPool(3);

    }
}

