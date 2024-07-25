package org.sample.variable;

public class BooleanTest {
	
	public static void main(String[] args) {

		boolean b1 = true;
		System.out.println("b1 = " + b1); // b1 = true
		
		System.out.println("-------------------------------------------");
		b1 = false;
		System.out.println("b1 = " + b1); // b1 = false
		
		System.out.println("-------------------------------------------");
		//b1 = 1; // error, can't cast boolean to int
	}
}