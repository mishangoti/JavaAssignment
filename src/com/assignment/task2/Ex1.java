package com.assignment.task2;

import java.util.Scanner;

public class Ex1 {
	
	public static void main(String[] args) {
		// 1. Write a program to check whether a number is positive or negative.
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        if (number > 0) {
            System.out.println(number + " is positive.");
        } else if (number < 0) {
            System.out.println(number + " is negative.");
        } else {
            System.out.println(number + " is neither positive nor negative.");
        }
        scanner.close();
	}

}
