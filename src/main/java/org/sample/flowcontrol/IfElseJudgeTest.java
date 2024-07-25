package org.sample.flowcontrol;

import java.util.Scanner; 
 
public class IfElseJudgeTest {
	
	public static void main(String[] args) {

		System.out.println("Please input a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if(num < 0) {
			System.out.println(num + " is negative");
		} else {
			if(num > 0) {
				System.out.println(num + " is positive");
			} else {
				System.out.println(num + " is zero");
			}
		}
	}
}