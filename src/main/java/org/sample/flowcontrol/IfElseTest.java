package org.sample.flowcontrol;

import java.util.Scanner; 
 
public class IfElseTest {
	
	public static void main(String[] args) {

		System.out.println("Please input your score: ");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();

		if(score >= 60) {
			System.out.println("Passed!");
		} else {
			System.out.println("Not passed!");
		}
	}
}