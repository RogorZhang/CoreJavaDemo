package org.sample.flowcontrol;

import java.util.Scanner; 
 
public class IfScoreTest {
	
	public static void main(String[] args) {

		System.out.println("Please input your score:  ");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();

		// 90 / 10 = 9;    91 / 10 = 9;  92 / 10 = 9;  99 / 10 = 9;   100 / 10 = 10;
		if(score >= 90 && score <= 100) {     // case 9:    case 10:  
			System.out.println("Grade A");
		} else if(score >= 80) {              // case 8: 
			System.out.println("Grade B");
		} else if(score >= 70) {              // case 7:
			System.out.println("Grade C");
		} else if(score >= 60) {              // case 6:
			System.out.println("Grade D");
		} else {                              // default:
			System.out.println("Grade E");
		}
	}
}