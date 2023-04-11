package com.assignment.task5;

import java.util.Arrays;

public class Ex_3 {

	public static void main(String[] args) {
		// 3. Write a program to check if two strings are anagrams of each other.
		// i/p : listen
		// i/p: silent
		String str1 = "listen";
		String str2 = "silent";
		
		if(areAnagrams(str1, str2)) {
			System.out.println(str1 + " and " + str2 + " are anagrams.");
		} else {
			System.out.println(str1 + " and " + str2 + " are not anagrams.");
		}
	}
	
	public static boolean areAnagrams(String str1, String str2) {
		char[] charArr1 = str1.toCharArray();
		char[] charArr2 = str2.toCharArray();
		
		Arrays.sort(charArr1);
		Arrays.sort(charArr2);
		
		return Arrays.equals(charArr1, charArr2);
	}

}
