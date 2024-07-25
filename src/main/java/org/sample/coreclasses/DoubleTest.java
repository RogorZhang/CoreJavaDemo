package org.sample.coreclasses;

public class DoubleTest {

    public static void main(String[] args) {

        Double db1 = Double.valueOf(3.14);
        System.out.println("db1 = " + db1); // 3.14
        double d1 = db1.doubleValue();
        System.out.println("d1 = " + d1); // 3.14

        System.out.println("---------------------------------------------");
        Double db2 = 3.14;
        double d2 = db2;

        System.out.println("---------------------------------------------");
        double d3 = Double.parseDouble("13.14");
        System.out.println("d3 = " + d3); // 13.14

        System.out.println("db2 not a number " + db2.isNaN()); // false 不是非数字
        Double db3 = Double.valueOf(0/0.0);
        System.out.println("db3 not a number " + db3.isNaN()); // true  是非数字


    }
}
