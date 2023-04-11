package com.assignment.task3;

import java.util.Scanner;

public class Ex_1 {

	public static void main(String[] args) {
		// 1. Write a program to display Fibonacci Series
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the limit of Fibonachi Series: ");
		int limit = input.nextInt();
		
		int firstNum = 0, secondNum = 1, nextNum;
		
		System.out.print("Series:" + firstNum + " , " + secondNum);
		
		for (int i = 2; i < limit; i++) {
			nextNum = firstNum + secondNum;
			System.out.print(" , " + nextNum);
			firstNum = secondNum;
			secondNum = nextNum;
		}
		input.close();
	}

}
