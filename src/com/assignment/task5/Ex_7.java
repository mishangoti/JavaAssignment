package com.assignment.task5;

import java.util.Arrays;

public class Ex_7 {

	public static void main(String[] args) {
		// 7. Write a JAVA method to return a boolean true if the string doesn’t have repeating letters and consecutive or nonconsecutive i.e.
		// all the letters of the string be unique (isogram) else false. Write a JAVA program that reverses the words of a sentence.
		// For eg, => “Be Happy and Stay Motivated”
		// => “eB yppah dna yatS detavitoM”
		String str = "This is mishan";
		String str1 = "Mishan";
		System.out.println("Is '" + str + "' an isogram? " + isIsogram(str));
		System.out.println("Is '" + str1 + "' an isogram? " + isIsogram(str1));
		
		String sentence = "Be Happy and Stay Motivated";
		System.out.println("Original Sentence : " + sentence);
		System.out.println("Reverce Sentence : " + reverseWards(sentence));
	}
	
	public static boolean isIsogram(String str) {
		str = str.toLowerCase();
        int len = str.length();
 
        char arr[] = str.toCharArray();
 
        Arrays.sort(arr);
        for (int i = 0; i < len - 1; i++) {
            if (arr[i] == arr[i + 1])
                return false;
        }
        return true;
	}
	
	public static String reverseWards(String sentence) {
		
		String[] words = sentence.split(" ");
		StringBuilder result = new StringBuilder();
		
		for (String word : words) {
			StringBuilder reverse = new StringBuilder(word).reverse();
			result.append(reverse).append(" ");
		}
		return result.toString().trim();
	}
}
