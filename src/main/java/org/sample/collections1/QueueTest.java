package org.sample.collections1;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

    public static void main(String[] args) {

        Queue queue = new LinkedList();
        System.out.println("queue values " + queue);

        System.out.println("----------------------------------------------------------");
        for (int i = 1; i <= 5; i++) {
            boolean b1 = queue.offer(i * 11);
            System.out.println("queue values" + queue); // 11 22 33 44 55
        }

        System.out.println("----------------------------------------------------------");
        // 3.head value
        System.out.println("head value is" + queue.peek()); // 11

        System.out.println("----------------------------------------------------------");
        int len = queue.size();
        for (int i = 1; i <= len; i++) {
            System.out.println("value is" + queue.poll()); // 11 22 33 44 55
        }

        System.out.println("----------------------------------------------------------");
        System.out.println("queue values " + queue); // [啥也没有]
    }
}
