package org.sample.flowcontrol;

public class ForForTest {
	
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print("Hello! ");
			}
			System.out.println();
		}
	}
}