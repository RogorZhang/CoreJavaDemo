package org.sample.operator;

public class LogicTest {
	
	public static void main(String[] args) {
		
		// 1.init two boolean variables
		boolean b1 = true;
		boolean b2 = false;

		System.out.println("b1 = " + b1); // b1 = true
		System.out.println("b2 = " + b2); // b2 = false
		
		System.out.println("---------------------------------------------");
		// 3.logic operator
		boolean b3 = b1 && b2;
		System.out.println("b3 = " + b3); // false
		System.out.println(b1 && b2); // false   and
		System.out.println(b1 || b2); // true    or
		System.out.println(!b1);  // false       Rebellion
		System.out.println(!b2);  // true
		
		System.out.println("---------------------------------------------");
		// 4.测试一下短路特性
		int ia = 3;
		int ib = 5;
		// for logic and, if the first condition is false, then will not execute second operation
		boolean b4 = (++ia == 3) && (++ib == 5);
		System.out.println("b4 = " + b4); // false
		System.out.println("ia = " + ia); // 4
		System.out.println("ib = " + ib); // 5
		
		// for logic or, if first condition is true, then second operation will not execute
		boolean b5 = (++ia == 5) || (++ib == 5);
		System.out.println("b5 = " + b5); // true
		System.out.println("ia = " + ia); // 5
		System.out.println("ib = " + ib); // 5
	}
}