package com.assignment.task3;

import java.util.Scanner;

public class Ex_4 {

	public static void main(String[] args) {
		// 4. Write a program to Check Whether a Number is Prime or Not.
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = input.nextInt();
		
        boolean isPrime = true;
        if(number <= 1) {
        	isPrime = false;
        } else {
        	for(int i = 2; i <= Math.sqrt(number); i++) {
        		if (number % i == 0) {
        			isPrime = false;
        			break;
        		}
        	}
        }
        
        if (isPrime) {
            System.out.println("The number is prime.");
        } else {
            System.out.println("The number is not prime.");
        }
        input.close();
	}

}
