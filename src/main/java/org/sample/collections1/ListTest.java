package org.sample.collections1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {

        List lt1 = new ArrayList();
        lt1.add("one");
        System.out.println("lt1 = " + lt1); // [one]

        System.out.println("----------------------------------------------------");
        List lt2 = new LinkedList();
        lt2.add("one");
        System.out.println("lt2 = " + lt2); // [one]
    }
}
