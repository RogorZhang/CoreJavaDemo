package org.sample.coreclasses;

public class MathTest {

    public static void main(String[] args) {

        System.out.println("max " + Math.max(10, 20)); // 20
        System.out.println("min " + Math.min(10, 20)); // 10
        System.out.println("2^3 " + Math.pow(2, 3)); // 8.0  体现double类型
        System.out.println("absolute value " + Math.abs(-5)); // 5
        System.out.println("round " + Math.round(3.14)); // 3
        System.out.println("sqrt " + Math.sqrt(16)); // 4.0
        System.out.println("random " + Math.random()); // 随机数
    }
}
