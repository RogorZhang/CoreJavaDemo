package org.sample.operator;

public class RelationTest {
	
	public static void main(String[] args) {
		int ia = 5;
		int ib = 2;

		boolean b1 = ia > ib;
		System.out.println("b1 = " + b1); // b1 = true
		System.out.println(ia > ib);   // greater       true
		System.out.println(ia >= ib);  // greater or equal  大于或者等于  true
		System.out.println(ia < ib);   // smaller       false
		System.out.println(ia <= ib);  // smaller or equal   false
		System.out.println(ia == ib);  // equal     false
		System.out.println(ia != ib);  // not equal    true
	}
}