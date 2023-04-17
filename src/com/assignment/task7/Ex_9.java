package com.assignment.task7;

public class Ex_9 {

	public static void main(String[] args) {
		// 9. Find all possible combinations of String? (using recursion)
		String str = "abc";
		System.out.println("All combinations of string " + str + ":");
		printCombinations(str);
	}
	
	public static void printCombinations(String str) {
		printCombinationsHelper("", str);
	}
	
	private static void printCombinationsHelper(String prefix, String str) {
		int n = str.length();
		if (n == 0) {
			System.out.println(prefix);
		}
		else {
			for (int i = 0; i < n; i++) {
				printCombinationsHelper(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
			}
		}
	}
}
