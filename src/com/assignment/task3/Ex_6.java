package com.assignment.task3;

import java.util.Scanner;

public class Ex_6 {

	public static void main(String[] args) {
		// 6. Write a do-while loop that asks the user to enter two numbers. The numbers should be added and the sum
		// displayed. The loop should ask the user whether he or she wishes to perform the operation again. If so,
		// the loop should repeat; otherwise it should terminate.
		Scanner input = new Scanner(System.in);
        char choice;
        do {
        	System.out.println("Enter the first number: ");
        	int num1 = input.nextInt();
        	System.out.println("Enter the second number: ");
        	int num2 = input.nextInt();
        	
        	int sum = num1 + num2;
        	System.out.println("The sum is: " + sum);
        	
        	System.out.println("Do you want to repeat operation (y/n): ");
        	choice = input.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');
        input.close();
	}
}
