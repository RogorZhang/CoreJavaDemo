package org.sample.flowcontrol;/*
    ���ʹ��if��֧�ṹ�������������е����ֵ
 */

import java.util.Scanner; 
 
public class IfMaxTest {
	
	public static void main(String[] args) {

		System.out.println("Please input two numbers: ");
		Scanner sc = new Scanner(System.in);
		int ia = sc.nextInt();
		int ib = sc.nextInt();

		int max = ia;
		if(ib > max) {
			max = ib;
		}
		System.out.println("Max is: " + max);
	}
}