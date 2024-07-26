package org.sample.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {

    public static void main(String[] args) {

        // Create thread pool
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        executorService.submit(new ThreadCallableTest());
        // close thread pool
        executorService.shutdown();
    }
}
