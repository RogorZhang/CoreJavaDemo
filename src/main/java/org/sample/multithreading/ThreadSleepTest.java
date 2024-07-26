package org.sample.multithreading;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class ThreadSleepTest extends Thread {
    private boolean flag = true;

    @Override
    public void run() {
        // get  system time every second
        while (flag) {
            Date d1 = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            System.out.println(sdf.format(d1));

            // sleep 1 seconds
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        ThreadSleepTest tst = new ThreadSleepTest();
        tst.start();

        // main thread start after 5 seconds
        System.out.println("Main thread waiting.......");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        tst.flag = false;
        System.out.println("Main thread waiting finish!");
    }
}
