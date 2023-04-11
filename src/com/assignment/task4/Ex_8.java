package com.assignment.task4;

import java.util.Arrays;

public class Ex_8 {

	public static void main(String[] args) {
		// 8. Given an array of n integers, find the third largest element. All the elements in the array are distinct integers.
		// Input: arr[] = {1, 16, 2, 19, 10, 20}
		// Output: The third Largest element is 16
		int [] arr = {1, 16, 2, 19, 10, 20};
		int thirdLargest = findThirdLargest(arr);
		System.out.println("Third largest element is : " + thirdLargest);
	}
	
	public static int findThirdLargest(int[] arr) {
		Arrays.sort(arr);
		int n = arr.length;
		if(n < 3) {
			System.out.println("Array should contain at least 3 elements !");
			return Integer.MIN_VALUE;
		}
		return arr[n-3];
	}

}
