package com.assignment.task2;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// 3. Write a program to compute quotient and reminder.
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the dividend: ");
        while (!scanner.hasNextInt()) { // validate integer input
            System.out.print("Invalid input. Please enter an integer value: ");
            scanner.next();
        }
        int dividend = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        while (!scanner.hasNextInt()) { // validate integer input
            System.out.print("Invalid input. Please enter an integer value: ");
            scanner.next();
        }
        int divisor = scanner.nextInt();

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("The quotient of " + dividend + " divided by " + divisor + " is " + quotient);
        System.out.println("The remainder of " + dividend + " divided by " + divisor + " is " + remainder);
        scanner.close();
	}

}
