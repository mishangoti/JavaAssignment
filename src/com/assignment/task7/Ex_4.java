package com.assignment.task7;

public class Ex_4 {

	public static void main(String[] args) {
		// 4. Program to Count the number of words in the String?
		String str1 = "Mishan Goti";
		String str2 = "  Mishan   Goti   ";
		String str3 = "";
		String str4 = "MishanGoti";
		String str5 = "    ";
		
        System.out.println("String: \"" + str1 + "\", Word count: " + countWords(str1));
        System.out.println("String: \"" + str2 + "\", Word count: " + countWords(str2));
        System.out.println("String: \"" + str3 + "\", Word count: " + countWords(str3));
        System.out.println("String: \"" + str4 + "\", Word count: " + countWords(str4));
        System.out.println("String: \"" + str5 + "\", Word count: " + countWords(str5));
	}
	
	public static int countWords(String str) {
		
		if(str == null || str.trim().isEmpty()) {
			return 0;
		}
		
		String[] words = str.trim().split("\\s+");
		
		return words.length;
	}

}
