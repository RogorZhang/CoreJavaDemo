package org.example.day7.iocDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        House house = context.getBean(House.class);
//        House house2 = new House(new Bathroom())
        System.out.println(house);
    }
}
