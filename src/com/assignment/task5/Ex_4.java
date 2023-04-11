package com.assignment.task5;

import java.util.Scanner;

public class Ex_4 {	
	public static void main(String[] args) {
		// 4. Write a program to count the occurrence of a given character in a string.
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str = input.nextLine();
		
		System.out.println("Enter a character: ");
		char character = input.next().charAt(0);
		
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if(character == str.charAt(i)) {
				count++;
			}
		}
		
		System.out.println("The occurance of" + character + " in " + str + " is : " + count);
		input.close();
	}
}
