package com.assignment.task5;

public class Ex_1 {

	public static void main(String[] args) {
		// 1. Write a program to reverse a string.
		// input-Consultadd
		// output-ddatlusnoC
		String str = "Consultadd"; 
		String reverse = "";
		
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		
		System.out.println("Original String: " + str);
		System.out.println("Reversed String: " + reverse);
	}

}
