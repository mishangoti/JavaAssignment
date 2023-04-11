package com.assignment.task5;

import java.util.Scanner;

public class Ex_2 {

	public static void main(String[] args) {
		// 2. Write a program to reverse a string in such way
		// input-Consultadd Pvt
		// Output-ddatlusnoC tvP
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = input.nextLine();
		String[] words = str.split(" ");
		StringBuilder result = new StringBuilder();
		
		for (String word : words) {
			StringBuilder reverse = new StringBuilder(word).reverse();
			result.append(reverse).append(" ");
		}
		System.out.println(result.toString().trim());
		input.close();
	}

}
