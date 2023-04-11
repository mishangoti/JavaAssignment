package com.assignment.task4;

import java.util.Scanner;

public class Ex_1 {

	public static void main(String[] args) {
		// 1. Write a program to print an array populated by the user.
		Scanner input = new Scanner(System.in);
		System.out.println("Enter array length : ");
		int arrayLength = input.nextInt();
		
		int[] array = new int[arrayLength];
		
		System.out.println("Enter" + arrayLength + " elements of array: ");
		for (int i = 0; i < arrayLength; i++) {
			array[i] = input.nextInt();
		}
		
		System.out.println("This is your array elements: [ ");
		for (int i = 0; i < arrayLength; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("]");
		input.close();
	}

}
