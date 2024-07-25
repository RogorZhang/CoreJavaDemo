package org.sample.flowcontrol;

public class ForContinueTest {
	
	public static void main(String[] args) {

		for(int i = 1; i <= 20; i++) {
			if(0 == i % 5) {
				continue;
			}
			System.out.println("i = " + i);
		}
	}
}