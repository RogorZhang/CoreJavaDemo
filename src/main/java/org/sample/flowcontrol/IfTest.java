package org.sample.flowcontrol;

import java.util.Scanner; 
 
public class IfTest {
	
	public static void main(String[] args) {

		System.out.println("Please input your age: ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();

		if(age >= 18) {
			System.out.println("Adult!");
		}

	}
}