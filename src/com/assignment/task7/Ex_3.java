package com.assignment.task7;

public class Ex_3 {

	public static void main(String[] args) {
		// 3. Program to find if String has all Unique Characters?
		String str1 = "abcdefg";
		String str2 = "abcdefga";
		System.out.println("String 1: " + str1);
        System.out.println("All characters are unique? " + hasUniqueCharacters(str1));
        System.out.println("String 2: " + str2);
        System.out.println("All characters are unique? " + hasUniqueCharacters(str2));
	}
	public static boolean hasUniqueCharacters(String str) {
		// Assuming ASCII character set (0-127)
        if (str.length() > 128) {
            return false;
        }
        
        boolean[] charSet = new boolean[128];
        
        for(int i = 0; i < str.length(); i++) {
        	int val = str.charAt(i);
        	if(charSet[val]) {
        		return false;
        	}
        	charSet[val] = true;
        }
        return true;
	}
}
