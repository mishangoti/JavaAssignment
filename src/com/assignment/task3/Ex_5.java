package com.assignment.task3;

import java.util.Scanner;

public class Ex_5 {

	public static void main(String[] args) {
		// 5. Write a program to sum first n even numbers using a while loop.
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        
        int sum = 0;
        int i = 1;
        while(i <= n) {
        	int evenNum = i * 2;
        	sum += evenNum;
        	i++;
        }
        System.out.println("The sum of the first " + n + " even numbers is " + sum);
        input.close();
	}

}
