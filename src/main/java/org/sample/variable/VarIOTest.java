package org.sample.variable;/*
   编程实现变量的输入输出
 */

import java.util.Scanner; 
 
public class VarIOTest {
	
	public static void main(String[] args) {
		
		// 1.init 2 variables to record name and age info
		//String name;
		//int age;
		
		// 2.Ask user to input name and age
		System.out.println("Please input your name and age: ");
		// read keyboard input
		Scanner sc = new Scanner(System.in);
		// read string to store in name
		String name = sc.next();
		// read int to store in age
		int age = sc.nextInt();
		
		// print name and age
		//System.out.println("name = " + name);
		//System.out.println("age = " + age);
		System.out.println("name = " + name + ", age = " + age);
	}
} 