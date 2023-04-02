package com.assignment.task1;

public class Ex3_1 {

	public static void main(String[] args) {
		// 3.2 Swap two numbers without using any third variable.
		
		int num1 = 4;
		int num2 = 9;
		
		System.out.println("Original values | Num1 : " + num1 + ", Num2 : " + num2);
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println("After swap with temp variable | Num1 : " + num1 + ", Num2 : "+ num2);
	}

}
