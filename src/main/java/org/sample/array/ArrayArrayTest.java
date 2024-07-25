package org.sample.array;

public class ArrayArrayTest {
	
	public static void main(String[] args) {
		
		//two-dimensional  array
		int[][] arr1 = new int[2][3];
		// print each element value
		// outer loop for Rows
		for(int i = 0; i < arr1.length; i++) {
			// inner loop for cols
			for(int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " "); // all 0
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------------------------");
		// 2.assign value
		int cnt = 1;
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = cnt++;
			}
		}

		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " "); // 1 2 3   4 5 6
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------------------------");
		// 3.init arr with values
		int[][] arr2 = {{11, 22, 33, 44}, {55, 66, 77, 88}};
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " "); // 11 22 33 44   55 66 77 88
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------------------------");

		int[][] arr3 = new int[3][];
		arr3[0] = new int[3];
		arr3[1] = new int[4];
		arr3[2] = new int[5];
	}
}