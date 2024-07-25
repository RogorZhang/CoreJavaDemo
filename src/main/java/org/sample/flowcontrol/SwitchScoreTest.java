package org.sample.flowcontrol;

import java.util.Scanner; 
 
public class SwitchScoreTest {
	
	public static void main(String[] args) {

		System.out.println("Please input your score: ");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();

		switch(score / 10) {
			case 10: //System.out.println("Grade A"); //break;
			case 9:  System.out.println("Grade A"); break;
			case 8:  System.out.println("Grade B"); break;
			case 7:  System.out.println("Grade C"); break;
			case 6:  System.out.println("Grade D"); break;
			default: System.out.println("Grade E"); //break;
		}

	}
}