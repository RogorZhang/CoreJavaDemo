package org.sample.array;

public class ArrayCopyTest {
	
	public static void main(String[] args) {

		int[] arr = {11, 22, 33, 44, 55};
		System.out.print("arr elements");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " "); // 11 22 33 44 55
		}
		System.out.println();
		
		System.out.println("----------------------------------------------------------");
		int[] brr = new int[3];
		System.out.print("brr elements ");
		for(int i = 0; i < brr.length; i++) {
			System.out.print(brr[i] + " "); // 0 0 0
		}
		System.out.println();
		
		System.out.println("----------------------------------------------------------");
		/*
		brr[0] = arr[1];
		brr[1] = arr[2];
		brr[2] = arr[3];
		*/
		/*
		for(int i = 0; i < brr.length; i++) {
			brr[i] = arr[i+1];
		}
		*/
		System.arraycopy(arr, 1, brr, 0, 3);

		System.out.print("第二个数组中的元素有：");
		for(int i = 0; i < brr.length; i++) {
			System.out.print(brr[i] + " "); // 22 33 44
		}
		System.out.println();
		
		System.out.println("----------------------------------------------------------");

		brr = arr;
		System.out.print("brr elements: ");
		for(int i = 0; i < brr.length; i++) {
			System.out.print(brr[i] + " "); // 22 33 44
		}
		System.out.println();	
		
	}
}