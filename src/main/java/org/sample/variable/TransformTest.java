package org.sample.variable;

public class TransformTest {
	
	public static void main(String[] args) {

		byte b1 = 10;
		short s1 = 20;
		System.out.println("b1 = " + b1); // b1 = 10
		System.out.println("s1 = " + s1); // s1 = 20
		
		System.out.println("----------------------------------------------");
		// 3.auto transfer
		// assign b1 value to b1£¬byte -> short,small to big auto transfer
		s1 = b1;
		System.out.println("b1 = " + b1); // b1 = 10
		System.out.println("s1 = " + s1); // s1 = 10
		
		System.out.println("----------------------------------------------");
		// short -> byte, big -> small,  need cast
		s1 = 128;
		b1 = (byte)s1;
		System.out.println("b1 = " + b1); // b1 = 10   -128 
		System.out.println("s1 = " + s1); // s1 = 10   128
	}
}