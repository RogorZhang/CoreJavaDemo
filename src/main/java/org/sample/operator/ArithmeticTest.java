package org.sample.operator;

public class ArithmeticTest {
	
	public static void main(String[] args) {

		int ia = 6;
		int ib = 2;
		System.out.println("ia = " + ia); // ia = 6
		System.out.println("ib = " + ib); // ib = 2
		
		System.out.println("----------------------------------------");
		// 2.+  -  *  /  % operator
		int ic = ia + ib;
		System.out.println("ic = " + ic); // ic = 8
		// 其中ia+ib这个整体叫做表达式  ia、ib叫做操作数   +叫做操作符/运算符
		System.out.println(ia + ib);  // 8
		System.out.println(ia - ib);  // 4
		System.out.println(ia * ib);  // 12
		System.out.println(ia / ib);  // 3
		System.out.println(ia % ib);  // 0
		
		System.out.println("----------------------------------------");
		// 3.Notice
		// 3.1 when two int do divide operator, only keep int part
		System.out.println(5 / 2); // 2
		
		System.out.println("----------------------------------------");
		// 3.2 what about you want to keep all number?
		// cast one of number to double
		System.out.println((double)5 / 2);   // 2.5
		System.out.println(5 / (double)2);   // 2.5
		System.out.println((double)5 / (double)2); // 2.5
		System.out.println((double)(5 / 2)); // 2.0
		// * 1.0
		System.out.println(5*1.0 / 2); // 2.5
		System.out.println(5.0 / 2);   // 2.5   ia.0 错误的表示
		
		System.out.println("----------------------------------------");
		// 3.3 can't divide by 0
		//System.out.println(5 / 0); // compile ok，java.lang.ArithmeticException(算术异常 记住): / by zero
		System.out.println(5 / 0.0); // Infinity 无穷
 		System.out.println(0 / 0.0); // NaN Not a Number 
	}
}