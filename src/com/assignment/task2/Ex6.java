package com.assignment.task2;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first number : ");
		double num1 = scanner.nextDouble();
		
		System.out.println("Enter second number : ");
		double num2 = scanner.nextDouble();
		
		System.out.println("Enter Operator (+, -, /, *): ");
		char operator = scanner.next().charAt(0);
		
		double result;
		
		switch(operator) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			default:
				System.out.println("Invalid operator!");
				scanner.close();
				return;
		}
		System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
		scanner.close();
	}

}
