package org.sample.collections2;

import java.util.LinkedList;
import java.util.List;

public class GenericTest {

    public static void main(String[] args) {

        // 1.声明两个List类型的集合进行测试
        List<Animal> lt1 = new LinkedList<>();
        List<Dog> lt2 = new LinkedList<>();

        System.out.println("---------------------------------------------");
        List<?> lt3 = new LinkedList<>();
        lt3 = lt1;
        lt3 = lt2;


        //lt3.add(new Animal()); Error
        //lt3.add(new Dog());    Error

        Object o = lt3.get(0);  // o

    }
}
