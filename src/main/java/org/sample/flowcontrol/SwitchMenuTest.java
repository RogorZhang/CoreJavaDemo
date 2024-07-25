package org.sample.flowcontrol;

import java.util.Scanner; 
 
public class SwitchMenuTest {
	
	public static void main(String[] args) {
		
		// 1.»æÖÆ×Ö·û½çÃæ
		System.out.println("         Welcome!");
		System.out.println("-------------------------------------");
		System.out.print(" [1]student system    ");
		System.out.println("[2]admin system    ");
		System.out.println(" [0]exit");
		System.out.println("-------------------------------------");
		System.out.println("Please enter your choice");
		Scanner sc = new Scanner(System.in);
		int choose = sc.nextInt();

		switch(choose) {
			case 1: System.out.println("Enter student system...."); break;
			case 2: System.out.println("Enter admin system..."); break;
			case 0: System.out.println("See you next time!"); break;
			default: System.out.println("Please input a valid choice!");
		}
	}
}