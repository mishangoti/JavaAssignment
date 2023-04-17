package com.assignment.task7;
import java.util.*;

public class Ex_10 {

	public static void main(String[] args) {
		// 10. Program to sort HashMap in java by keys and values?
		HashMap<String, Integer> hashMap = new HashMap<>();
		hashMap.put("John", 25);
        hashMap.put("Alice", 30);
        hashMap.put("Bob", 22);
        hashMap.put("Charlie", 28);
        hashMap.put("Eve", 35);	
        System.out.println("Original HashMap: " + hashMap);

        TreeMap<String, Integer> sortedByKey = new TreeMap<>(hashMap);
        System.out.println("Sorted HashMap by keys: " + sortedByKey);   
	}
}
