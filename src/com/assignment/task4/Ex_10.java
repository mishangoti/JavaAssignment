package com.assignment.task4;

import java.util.Arrays;

public class Ex_10 {

	public static void main(String[] args) {
		// 10. Write a Java program to check the equality of two arrays?
		int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3 = {5, 4, 3, 2, 1};

        boolean areEqual1 = Arrays.equals(arr1, arr2);
        boolean areEqual2 = Arrays.equals(arr1, arr3);

        System.out.println(Arrays.toString(arr1) + " and " + Arrays.toString(arr2) + " are equal: " + areEqual1);
        System.out.println(Arrays.toString(arr1) + " and " + Arrays.toString(arr3) + " are equal: " + areEqual2);
	}

}
