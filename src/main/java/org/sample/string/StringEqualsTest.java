package org.sample.string;

import java.util.Scanner;

public class StringEqualsTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        for (int i = 3; i > 0; i--) {
            System.out.println("Please input your name and password");
            String userName = sc.next();
            String password = sc.next();

            if ("admin".equalsIgnoreCase(userName) && "123456".equals(password)) { // avoid NPE
                System.out.println("Login successful!");
                break;
            }

            if (1 == i) {
                System.out.println("account freeze!");
            } else {
                System.out.println("wrong username or password,  you have " + (i - 1) + " chance to input!");
            }

        }

        sc.close();
    }
}
