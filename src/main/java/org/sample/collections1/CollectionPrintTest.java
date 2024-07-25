package org.sample.collections1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class CollectionPrintTest {

    public static void main(String[] args) {

        Collection c1 = new ArrayList();
        c1.add("one");
        c1.add(2);
        c1.add(new Person("zhangfei", 30));
        System.out.println("c1 = " + c1); // [one, 2, Person{name='zhangfei', age=30}]

        System.out.println("------------------------------------------------");

        Iterator iterator1 = c1.iterator();

        while (iterator1.hasNext()) {
            System.out.println("value is " + iterator1.next());
        }

        System.out.println("------------------------------------------------");

        iterator1 = c1.iterator();
        //use iterator
        StringBuilder sb1 = new StringBuilder();
        sb1.append("[");
        while (iterator1.hasNext()) {
            Object obj = iterator1.next();

            if (!iterator1.hasNext()) {
                sb1.append(obj).append("]");
            } else {

                sb1.append(obj).append(",").append(" ");
            }
        }
        // [one, 2, Person{name='zhangfei', age=30}]
        System.out.println("c1 = " + sb1);

        System.out.println("------------------------------------------------");
        iterator1 = c1.iterator();
        while (iterator1.hasNext()) {
            Object obj = iterator1.next();
            if("one".equals(obj)) {
                iterator1.remove();  //safe delete
                //c1.remove(obj); // ConcurrentModificationException
            }
        }
        System.out.println("after delete" + c1); // [2, Person{name='zhangfei', age=30}]

        System.out.println("------------------------------------------------");
        for (Object obj : c1) {
            System.out.println("person is" + obj);
        }

        int[] arr = new int[] {11, 22, 33, 44, 55};
        for (int i : arr) {
            System.out.println("i = " + i);
            i = 66;
        }
        System.out.println("arr values " + Arrays.toString(arr));

    }
}
