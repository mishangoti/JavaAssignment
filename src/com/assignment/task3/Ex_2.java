package com.assignment.task3;

import java.util.Scanner;

public class Ex_2 {

	public static void main(String[] args) {
		// 2. Write a program to Find Factorial of a Number.
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = input.nextInt();
		
		int factorial = 1;
		for (int i = 1; i <= number; i++) {
			factorial *= i;
			// or factorial = factorial * i
		}
        System.out.printf("Factorial of %d is %d\n", number, factorial);
        input.close();
	}

}
