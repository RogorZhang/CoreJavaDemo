package org.sample.flowcontrol;

public class ForSumTest {
	
	public static void main(String[] args) {

		int sum = 0;

		for(int i = 1; i <= 100; i++) {
			sum += i; // sum = sum + i;
		}

		System.out.println("sum = " + sum);
	}
}