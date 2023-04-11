package com.assignment.task3;

import java.util.Scanner;

public class Ex_3 {

	public static void main(String[] args) {
		// 3. Write a program to Check Palindrome.
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = input.nextLine();
		str = str.replaceAll("\\s+", "").toLowerCase();
		String strReverse = "";
		
		// reverse string
		for (int i = (str.length() - 1); i>=0; --i) {
			strReverse = strReverse + str.charAt(i);
		}
		
		if (str.equals(strReverse)) {
            System.out.printf("The string '%s' is a palindrome.", str);
        } else {
            System.out.printf("The string '%s' is not a palindrome.", str);
        }
		input.close();
	}

}
