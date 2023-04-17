package com.assignment.task7;

public class Ex_7 {

	public static void main(String[] args) {
		// 7. Print all permutations of the String
		String str = "abc";
		System.out.println("All permutationss of string " + str + ":");
		printPermutations(str);
	}
	
	public static void printPermutations(String str) {
		printPermutationsHelper("", str);
	}
	
	private static void printPermutationsHelper(String prefix, String str) {
		int n = str.length();
		if (n == 0) {
			System.out.println(prefix);
		}
		else {
			for (int i = 0; i < n; i++) {
				printPermutationsHelper(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
			}
		}
	}

}
