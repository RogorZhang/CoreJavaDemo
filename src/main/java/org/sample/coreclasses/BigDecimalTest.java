package org.sample.coreclasses;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalTest {

    public static void main(String[] args) {

        BigDecimal bd1 = new BigDecimal("5.2");
        BigDecimal bd2 = new BigDecimal("1.3");

        System.out.println("+ result " + bd1.add(bd2)); // 6.5
        System.out.println("- result " + bd1.subtract(bd2)); // 3.9
        System.out.println("* result " + bd1.multiply(bd2)); // 6.76
        System.out.println("/ result " + bd1.divide(bd2)); // 4

        System.out.println("---------------------------------------------------------------");
        System.out.println(0.1 + 0.2); // 0.30000000000000004
        BigDecimal bd3 = new BigDecimal("0.1");
        BigDecimal bd4 = new BigDecimal("0.2");
        System.out.println("big decimal result " + bd3.add(bd4)); // 0.3

        System.out.println("---------------------------------------------------------------");
        BigDecimal bd5 = new BigDecimal("2");
        BigDecimal bd6 = new BigDecimal("0.3");
        System.out.println("/ result" + bd5.divide(bd6, RoundingMode.HALF_UP)); // 7
    }
}
