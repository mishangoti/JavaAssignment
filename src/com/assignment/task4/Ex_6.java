package com.assignment.task4;

import java.util.*;

public class Ex_6 {

	public static void main(String[] args) {
		// 6. Write a Java program to find the sum of the two elements of a given array which is equal to a given integer.
		// a. Sample array: [1,2,4,5,6]
		// b. Target value: 6
		int[] arr = {1, 2, 3, 4, 5, 6};
        int target = 9;
        findSumOfTwoElements(arr, target);
	}
	
    public static void findSumOfTwoElements(int[] arr, int target) {
    	Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                System.out.println(target + " can be get by adding: " + arr[i] + " and " + complement);
                return;
            }
            map.put(arr[i], i);
        }
        System.out.println("Not posible to make " + target + "with using array.");
    }

}
