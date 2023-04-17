package com.assignment.task7;

import java.util.*;

public class Ex_6 {

	public static void main(String[] args) {
		// 6. Program to Count occurrences of each character in a string in java?
		
		String str = "Mishan goti";
		
		Map<Character, Integer> charCount = new HashMap<>();
		
		// convert str in to array of all characters
		char[] charArray = str.toCharArray();
		
		// check each character and put it in to map if it is new and update count if it is already exist in HashMap
		for(char c : charArray) {
			if(charCount.containsKey(c)) {
				charCount.put(c, charCount.get(c) + 1);
			} else {
				charCount.put(c, 1);
			}
		}
		
		// print all characters with its count
		System.out.println("Character counts in the string \"" + str + "\":");
		for(Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            System.out.println("'" + entry.getKey() + "': " + entry.getValue() + " occurrence(s)");
		}

	}

}
