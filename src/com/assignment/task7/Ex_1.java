package com.assignment.task7;

public class Ex_1 {

	public static void main(String[] args) {
		// 1. Program to find the first nonrepeated character in the String

		char firstNonRepeatedChar = findFirstNonRepeatedChar("abccdefgabcc");
        if (firstNonRepeatedChar != '\u0000') {
            System.out.println("First non-repeated character: " + firstNonRepeatedChar);
        } else {
            System.out.println("non-repeated character not found.");
        }
	}

	public static char findFirstNonRepeatedChar(String s) {
		char[] chars = s.toCharArray();
		
        int[] charCounts = new int[256]; // Assuming ASCII characters
        
        for (char c : chars) {
            charCounts[c]++;
        } 
        
        for (char c : chars) {
            if (charCounts[c] == 1) {
                return c;
            }
        }
 		return '\u0000';
	}
}
