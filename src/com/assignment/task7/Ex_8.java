package com.assignment.task7;

public class Ex_8 {

	public static void main(String[] args) {
		// 8. Find the maximum value in Array without using Collection?
		int[] arr = { 5, 3, 93, 2, 7, 1, 85, 6, 4 };
        int maxValue = findMaxValue(arr);
        System.out.println("Maximum value in the array: " + maxValue);
	}
	
	public static int findMaxValue(int[] arr) {
		if(arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
		}
		
		int maxValue = 0;
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] > maxValue) {
				maxValue = arr[i];
			}
		}
		
		return maxValue;
	}

}
