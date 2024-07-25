package org.sample.flowcontrol;

public class DoWhileTest {
	
	public static void main(String[] args) {
		
		//for loop
		for(int i = 1; i <= 10; i++) {
			System.out.println("i = " + i);
		}
		
		System.out.println("-----------------------------");

		// 2.while loop
		int i = 1;
		while(i <= 10) {
			System.out.println("i = " + i);
			i++;
		}
		
		System.out.println("-----------------------------");
		// do while loop
		i = 1;
		do {
			System.out.println("i = " + i);
			i++;
		} while(i <= 10);
		
		
	}
}