package org.sample.multithreading;

public class ThreadDaemonTest extends Thread {
    @Override
    public void run() {
        // when sub thread is not Daemon Thread, the sub thread will continue execute until finished even main thread execute done
        // when sub thread is Daemon Thread, the sub thread will stop execute ifmain thread execute done
        for (int i = 0; i < 50; i++) {
            System.out.println("Sub Thread i = " + i);
        }
    }

    public static void main(String[] args) {

        ThreadDaemonTest tdt = new ThreadDaemonTest();
        // set sub thread is Daemon
        tdt.setDaemon(true);
        tdt.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("-------Main Thread i = " + i);
        }
    }
}
