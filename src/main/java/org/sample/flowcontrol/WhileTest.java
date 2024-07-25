package org.sample.flowcontrol;

public class WhileTest {
	
	public static void main(String[] args) {

		for(int i = 1; i <= 10; i++) {
			System.out.println("i = " + i);
		}
		
		System.out.println("-----------------------------");
		int i = 1;
		while(i <= 10) {
			System.out.println("i = " + i);
			i++;
		}
	}
}