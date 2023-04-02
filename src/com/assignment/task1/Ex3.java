package com.assignment.task1;

public class Ex3 {

	public static void main(String[] args) {
		// 3.1 using the third variable as the result 
		
		int num1 = 4;
		int num2 = 9;
		int temp;
		
		System.out.println("Original values | Num1 : " + num1 + ", Num2 : " + num2);
		
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("After swap with temp variable | Num1 : " + num1 + ", Num2 : "+ num2);
	}

}
