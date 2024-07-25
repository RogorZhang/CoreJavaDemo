package org.sample.inherit;

public class StaticTest {
	
	private int cnt = 1; //obj-level variable
	private static int snt = 2; // class-level variable, only 1 copy

	public void show() {
		System.out.println("cnt = " + this.cnt); // 1
		System.out.println("snt = " + this.snt); // 2
	}

	public static void test() {
		System.out.println("snt = " + snt); // 2 
	}
	
	public static void main(String[] args) {
		
		StaticTest st = new StaticTest();
		st.show();
		
		System.out.println("--------------------------------");
		StaticTest.test();
	}
}