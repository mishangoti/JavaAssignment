package com.assignment.task4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Ex_9 {

	public static void main(String[] args) {
		// 9. Given an array of integers, return indices of the two numbers such that they add up to a specific target.
		// Input: nums = [1,4,10,-3], target = 14
		// Output: [1,2] or [2,1] # 4 + 10 = 14
		int[] nums = {1, 4, 10, -3};
        int target = 14;
        int[] result = findSumOfTwoElements(nums, target);
        if (result != null) {
            System.out.println(Arrays.toString(result));
        } else {
            System.out.println("No two elements found in the array that add up to the target");
        }
	}
	
	public static int[] findSumOfTwoElements(int[] arr, int target) {
    	Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i}; 
            }
            map.put(arr[i], i);
        }
        return null;
    }

}
