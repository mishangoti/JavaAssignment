package com.assignment.task7;

import java.util.*;

public class Ex_2 {

	public static void main(String[] args) {
		// 2. Program to find the intersection of two arrays in java?
		int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {4, 5, 6, 7, 8};
        int[] intersection = findIntersection(arr1, arr2);
        System.out.println("Intersection of arr1 and arr2: " + Arrays.toString(intersection));
	}
	
	public static int[] findIntersection(int[] arr1, int[] arr2) {
		
		// use hashset
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		
		// add array element in to Hash
		for(int num : arr1) {
			set1.add(num);
		}
		for(int num : arr2) {
			set2.add(num);
		}
		// which ever element matchers in set1 will be retain from str1
        set1.retainAll(set2);
        
        // Convert the resulting set back to an array
        int[] intersection = new int[set1.size()];
        int index = 0;
        for (int num : set1) {
            intersection[index++] = num;
        }

        return intersection;
	}
}
