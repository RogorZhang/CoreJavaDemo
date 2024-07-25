package org.sample.operator;

import java.util.Scanner; 
 
public class LogicJudgeTest {
	
	public static void main(String[] args) {
		
		// 1.ask user input a int value
		System.out.println("Please input a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		//System.out.println(100 <= num <= 999); // wrong expression
		// check if the input is three digits number
		System.out.println(100 <= num && num <= 999);
		// use Conditional Operator
		System.out.println(num + ((100 <= num && num <= 999)? " is three digits": "not three digits"));
	}
}
 