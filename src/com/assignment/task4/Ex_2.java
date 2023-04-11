package com.assignment.task4;

public class Ex_2 {

	public static void main(String[] args) {
		// 2. Write a program to Calculate Average Using Arrays.
		int[] array = {46, 35, 74, 84, 21};
		
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		} 
		double average = (double) sum / array.length;
		System.out.println("Sum : " + sum + " And Average : " + average);
	}

}
