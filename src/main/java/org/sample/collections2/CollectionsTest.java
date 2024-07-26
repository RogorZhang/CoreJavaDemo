package org.sample.collections2;

import java.util.*;

public class CollectionsTest {

    public static void main(String[] args) {

        List<Integer> lt1 = Arrays.asList(10, 30, 20, 50, 45);
        System.out.println("max value in list is " + Collections.max(lt1)); // 50
        System.out.println("min value in list is " + Collections.min(lt1)); // 10

        // reverse
        Collections.reverse(lt1);
        System.out.println("lt1 = " + lt1); // [45, 50, 20, 30, 10]
        // swap
        Collections.swap(lt1, 0, 4);
        System.out.println("after swap lt1 = " + lt1); // [10, 50, 20, 30, 45]
        // sort
        Collections.sort(lt1);
        System.out.println("after sort lt1 = " + lt1); // [10, 20, 30, 45, 50]
        // shuffle
        Collections.shuffle(lt1);
        System.out.println("after shuffle lt1 = " + lt1); // [30, 10, 45, 20, 50] 随机
        // copy
        //List<Integer> lt2 = new ArrayList<>(20);
        List<Integer> lt2 = Arrays.asList(new Integer[10]);
        System.out.println("lt1 size is " + lt1.size());
        System.out.println("lt2 size is " + lt2.size());
        //copy lt1 to lt2
        Collections.copy(lt2, lt1);
        System.out.println("lt2 = " + lt2);
    }
}
