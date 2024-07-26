package org.sample.exceptions;

import java.io.IOException;

public class ExceptionPreventTest {

    public static void main(String[] args) {

        int ia = 10;
        int ib = 0;
        if (0 != ib) {
            System.out.println(ia / ib);
        }

        // indexOutOfBoundary
        int[] arr = new int[5];
        int pos = 5;
        if (pos >= 0 && pos < 5) {
            System.out.println(arr[pos]);
        }

        // NPE
        String str = null;
        if (null != str) {
            System.out.println(str.length());
        }

        // 类型转换异常
        Exception ex = new Exception();
        if (ex instanceof IOException) {
            IOException ie = (IOException) ex;
        }

        // format exception
        String str2 = "123a";
        if (str2.matches("\\d+")) {
            System.out.println(Integer.parseInt(str2));
        }

        System.out.println("All done!");
    }
}
