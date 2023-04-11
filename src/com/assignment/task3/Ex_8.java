package com.assignment.task3;

import java.util.Scanner;

public class Ex_8 {

	public static void main(String[] args) {
		// 8. Write a program to enter the numbers till the user wants and at the end the program should display the
		// largest and smallest numbers entered. (using loops only)
        Scanner input = new Scanner(System.in);
        int number, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        char choice;
        
        do {
        	System.out.println("Enter Number : ");
        	number = input.nextInt();
        	
        	if(number > max) {
        		max = number;
        	}
        	
        	if(number < min) {
        		min = number;
        	}
        	
        	System.out.println("Do you want to enter another number? : y/n : ");
        	choice = input.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');
        
        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min);
	}

}
