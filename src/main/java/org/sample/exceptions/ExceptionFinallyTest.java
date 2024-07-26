package org.sample.exceptions;

public class ExceptionFinallyTest {

    public static int test() {
        try {
            int[] arr = new int[5];
            System.out.println(arr[5]);
            return 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            return 1;
        } finally {
            return 2; // return
        }
    }

    public static void main(String[] args) {

        try {
            int ia = 10;
            int ib = 0;
            System.out.println(ia / ib);
        } catch (ArithmeticException e) {
            e.printStackTrace();

            String str1 = null;
            //str1.length(); // NPE

        } finally {
            System.out.println("Will execute!");  // still execute
        }

        System.out.println("Over! ");

        System.out.println("----------------------------------------");
        int test = test();
        System.out.println("test = " + test); // 2
    }
}
