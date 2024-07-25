package org.sample.collections1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionTest {

    public static void main(String[] args) {

        Collection c1 = new ArrayList();

        System.out.println("c1 values " + c1); // [啥也没有]

        System.out.println("--------------------------------------------------------");

        boolean b1 = c1.add(new String("one"));
        System.out.println("b1 = " + b1); // true
        System.out.println("c1 values " + c1); // [one]

        b1 = c1.add(Integer.valueOf(2));
        System.out.println("b1 = " + b1); // true
        System.out.println("c1 values " + c1); // [one, 2]

        b1 = c1.add(new Person("zhangfei", 30));
        System.out.println("b1 = " + b1); // true
        System.out.println("c1 values" + c1); // [one, 2, Person{name='zhangfei', age=30}]

        System.out.println("--------------------------------------------------------");
        Collection c2 = new ArrayList();
        c2.add("three");
        c2.add(4);
        System.out.println("c2 = " + c2); // [three, 4]


        b1 = c1.addAll(c2);
        System.out.println("b1 = " + b1);
        // [one, 2, Person{name='zhangfei', age=30}, three, 4]    [one, 2, Person{name='zhangfei', age=30}, [three, 4]]
        System.out.println("c1 = " + c1);

        System.out.println("--------------------------------------------------------");


        b1 = c1.contains(new String("one"));
        System.out.println("b1 = " + b1); // true

        b1 = c1.contains(new String("two"));
        System.out.println("b1 = " + b1); // false

        b1 = c1.contains(Integer.valueOf(2));
        System.out.println("b1 = " + b1); // true

        b1 = c1.contains(Integer.valueOf(3));
        System.out.println("b1 = " + b1); // false
        b1 = c1.contains(new Person("zhangfei", 30));
        System.out.println("b1 = " + b1); // true  false

        System.out.println("--------------------------------------------------------");
        // [one, 2, Person{name='zhangfei', age=30}, three, 4]
        System.out.println("c1 = " + c1);

        Collection c3 = new ArrayList();
        c3.add(4);
        System.out.println("c3 = " + c3); // [4]

        b1 = c1.containsAll(c3);
        System.out.println("b1 = " + b1); // true

        c3.add("five");
        System.out.println("c3 = " + c3); // [4, five]
        b1 = c1.containsAll(c3);
        System.out.println("b1 = " + b1); // false

        System.out.println("c2 = " + c2); // [three, 4]
        b1 = c1.containsAll(c2);
        System.out.println("b1 = " + b1); // true false
        b1 = c1.contains(c2);
        System.out.println("b1 = " + b1); // false true

        System.out.println("--------------------------------------------------------");
        System.out.println("c2 = " + c2); // [three, 4]
        System.out.println("c3 = " + c3); // [4, five]

        b1 = c2.retainAll(c2);
        System.out.println("b1 = " + b1); // false 表示当前集合中的元素没有发生改变
        System.out.println("c2 = " + c2); // [three, 4]

        b1 = c2.retainAll(c3);
        System.out.println("b1 = " + b1); // true
        System.out.println("c2 = " + c2); // [4]
        System.out.println("c3 = " + c3); // [4, five]

        System.out.println("--------------------------------------------------------");
        // [one, 2, Person{name='zhangfei', age=30}, three, 4]
        System.out.println("c1 = " + c1);

        b1 = c1.remove(1);
        System.out.println("b1 = " + b1); // false
        // [one, 2, Person{name='zhangfei', age=30}, three, 4]
        System.out.println("c1 = " + c1);

        b1 = c1.remove("one");
        System.out.println("b1 = " + b1); // true
        // [2, Person{name='zhangfei', age=30}, three, 4]
        System.out.println("c1 = " + c1);

        // use equals to remove
        b1 = c1.remove(new Person("zhangfei", 30));
        System.out.println("b1 = " + b1); // true
        // [2, three, 4]
        System.out.println("c1 = " + c1);

        System.out.println("--------------------------------------------------------");
        System.out.println("c3 = " + c3); // [4, five]
        b1 = c1.removeAll(c3);
        System.out.println("b1 = " + b1); // true
        // [2, three]
        System.out.println("c1 = " + c1);
        System.out.println("c3 = " + c3); // [4, five]

        b1 = c1.remove(c3);
        System.out.println("b1 = " + b1); // false
        System.out.println("c1 = " + c1); // [2, three]

        System.out.println("--------------------------------------------------------");
        System.out.println("c1 size " + c1.size()); // 2

        c1.clear();
        System.out.println("c1 size" + c1.size()); // 0

        // 准备两个集合并判断是否相等
        Collection c4 = new ArrayList();
        c4.add(1);
        c4.add(2);
        System.out.println("c4 = " + c4); // [1, 2]
        Collection c5 = new ArrayList();
        c5.add(1);
        c5.add(2);
        c5.add(3);
        System.out.println("c5 = " + c5); // [1, 2, 3]

        b1 = c4.equals(c5);
        System.out.println("b1 = " + b1); // true  false

    }
}
