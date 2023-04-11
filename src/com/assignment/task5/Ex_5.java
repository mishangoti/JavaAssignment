package com.assignment.task5;

import java.util.Scanner;

public class Ex_5 {

	public static void main(String[] args) {
		// 5. Write a program to count a number of vowels and consonants in a String.
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String inputString = input.nextLine();
		
		int vowelsCount = 0;
		int consonantsCount = 0;
		
		inputString = inputString.toLowerCase();
		
		for(int i = 0; i < inputString.length(); i++) {
			char ch = inputString.charAt(i);
			
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowelsCount++;
			} else if ((ch >= 'a' || ch <= 'z')) {
				consonantsCount++;
			}
		}
		
		System.out.println("Number of vowels: " + vowelsCount);
		System.out.println("Number of consonants: " + consonantsCount);
		input.close();
	}

}
