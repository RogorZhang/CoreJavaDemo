package org.sample.flowcontrol;

import java.util.Scanner; 
 
public class IfElseifElseTest {
	
	public static void main(String[] args) {
		System.out.println("Please input type:");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		// if else if else
		if("a".equals(str)) {
			System.out.println("type a");
		} else if("b".equals(str)) {
			System.out.println("type b");
		} else if("c".equals(str)) {
			System.out.println("type c");
		}else{
			System.out.println("other types");
		}

	}
}