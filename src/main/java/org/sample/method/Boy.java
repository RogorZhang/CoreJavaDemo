package org.sample.method;

public class Boy {
	
	String name; // 用于描述姓名的成员变量
	
	// Constructor with no parameter
	Boy() {
		// call constructor with parameter
		//this("test");
		System.out.println("Constructor without parameter!");
	}
	Boy(String name) {
		// call no parameter constructor
		this();
		System.out.println("Constructor with parameter!" );
		this.name = name;
	}
	// normal method
	void show() {
		System.out.println("My name is " + name);
	}
	
	public static void main(String[] args) {
		
		// 1.Call non parameter constructor
		Boy b1 = new Boy();
		b1.show(); // null
		
		System.out.println("-----------------------------------");
		// 2.Call parameter constructor
		Boy b2 = new Boy("test");
		b2.show(); // test

	}
}