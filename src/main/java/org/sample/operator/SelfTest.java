package org.sample.operator;

public class SelfTest {
	
	public static void main(String[] args) {

		int ia = 10;
		System.out.println("ia = " + ia); // ia = 10
		
		System.out.println("---------------------------------------------");
		ia++;   // ia = ia + 1;
		System.out.println("ia = " + ia); // ia = 11

		++ia;
		System.out.println("ia = " + ia); // ia = 12

		--ia;
		System.out.println("ia = " + ia); // ia = 11
		
		ia--;
		System.out.println("ia = " + ia); // ia = 10
		
		System.out.println("---------------------------------------------");
		System.out.println(ia++);         // 10
		System.out.println("ia = " + ia); // 11
		System.out.println(++ia);         // 12
		System.out.println("ia = " + ia); // 12
		
		System.out.println("---------------------------------------------");
		int ib = ia++;
		System.out.println("ib = " + ib); // 12
		System.out.println("ia = " + ia); // 13
		int ic = ++ia;
		System.out.println("ic = " + ic); // 14
		System.out.println("ia = " + ia); // 14
		
		//                  14  + 16
		System.out.println(ia++ + ++ia);  // 30
		System.out.println("ia = " + ia); // 16
		
	}
}