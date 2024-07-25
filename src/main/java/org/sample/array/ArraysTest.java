package org.sample.array;

import java.util.Arrays; 
 
public class ArraysTest {
	
	public static void main(String[] args) {

		int[] arr1 = {10, 20, 30, 40, 50};
		System.out.println("arr elements " + Arrays.toString(arr1));  // [10, 20, 30, 40, 50]
		
		System.out.println("---------------------------------------------------");

		int[] arr2 = new int[5];
		System.out.println("arr2 elements " + Arrays.toString(arr2)); // [0, 0, 0, 0, 0]
		Arrays.fill(arr2, 10);
		System.out.println("arr2 elements " + Arrays.toString(arr2)); // [10, 10, 10, 10, 10]
		
		System.out.println("---------------------------------------------------");
		int[] arr3 = new int[5];
		Arrays.fill(arr3, 10);
		System.out.println("arr3 elements " + Arrays.toString(arr3)); // [10, 10, 10, 10, 10]
		System.out.println(Arrays.equals(arr2, arr3)); // true

		arr3[4] = 20;
		System.out.println("arr3 elements " + Arrays.toString(arr3)); // [10, 10, 10, 10, 20]
		System.out.println(Arrays.equals(arr2, arr3)); // false
		arr2[3] = 20;
		System.out.println("arr2 elements " + Arrays.toString(arr2)); // [10, 10, 10, 20, 10]
		System.out.println(Arrays.equals(arr2, arr3)); // false
	}
}