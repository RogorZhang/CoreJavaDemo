package org.sample.array;

/*
    编程实现一维数组的声明和使用
 */
public class ArrayTest {
	
	public static void main(String[] args) {

		int[] arr1 = new int[2];

		System.out.println("arr length " + arr1.length); // 2   下标从0 ~ 1
		System.out.println("index 0 value " + arr1[0]);  // 0  默认值
		System.out.println("index 1 value" + arr1[1]); 	// 0
        //System.out.println("index 2 value " + arr1[2]); 	//ArrayIndexOutOfBoundsException

		System.out.println("------------------------------------------------");

		for(int i = 0; i < arr1.length; i++) {
			System.out.println("index " + i + "'s value is " + arr1[i]); // 全是0
		}


		System.out.println("arr1 = " + arr1);
		
		System.out.println("------------------------------------------------");


		double[] arr2 = new double[5];
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]); // all 0.0
		}
		
		System.out.println("------------------------------------------------");

		char[] arr3 = {'a', 'b', 'c', 'd'};
		for(int i = 0; i < arr3.length; i++) {
			System.out.println("index " + i + "'s value is " + arr3[i]); // a b c d
		}
		
		System.out.println("------------------------------------------------");
		boolean[] arr4 = new boolean[]{true, true, false, false};
		for(int i = 0; i < arr4.length; i++) {
			System.out.println("index " + i + "'s value is" + arr4[i]); // true true false false
		}
	}
}