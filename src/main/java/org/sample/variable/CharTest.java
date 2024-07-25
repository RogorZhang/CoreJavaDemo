package org.sample.variable;
public class CharTest {
	
	public static void main(String[] args) {

		char c1 = 'a';
		System.out.println("c1 = " + c1); // c1 = a   
		System.out.println("cast to int£º" + (int)c1); // cast char to int   97
		
		System.out.println("-------------------------------------------------------------------------");
		char c2 = 98;
		System.out.println("c2 = " + c2); // c2 = b   
		System.out.println("cast to int£º" + (int)c2); // 98
	}
}