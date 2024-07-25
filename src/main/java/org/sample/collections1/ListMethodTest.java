package org.sample.collections1;

import java.util.LinkedList;
import java.util.List;

public class ListMethodTest {

    public static void main(String[] args) {

        List lt1 = new LinkedList();
        System.out.println("lt1 = " + lt1);

        System.out.println("------------------------------------------");
        lt1.add(0, "one");
        System.out.println("lt1 = " + lt1); // [one]


        lt1.add(1, 3);
        System.out.println("lt1 = " + lt1); // [one, 3]

        lt1.add(1, "two");
        System.out.println("lt1 = " + lt1); // [one, two, 3]

        System.out.println("------------------------------------------");

        String str1 = (String) lt1.get(0);
        System.out.println("获取到的元素是：" + str1); // one


        System.out.println("------------------------------------------");

        StringBuilder sb1 = new StringBuilder();
        sb1.append("[");
        for (int i = 0; i < lt1.size(); i++) {
            Object obj = lt1.get(i);
            if (lt1.size()-1 == i) {
                sb1.append(obj).append("]");
            }
            else {
                sb1.append(obj).append(",").append(" ");
            }
        }
        System.out.println("lt1 = " + sb1); // [one, two, 3]

    }
}
