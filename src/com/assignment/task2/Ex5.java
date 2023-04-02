package com.assignment.task2;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// 5. Write a program to assign the grade
		// on the basis of percentage
		// if the percentage is above 90,
		// assign grade A
		// if the percentage is above 75,
		// assign grade B
		// if the percentage is above 65,
		// assign grade C
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a percentage: ");
        int percentage = scanner.nextInt();
        char grade;
        if(percentage >= 90) {
        	grade = 'A';
        } else if (percentage >= 75) {
            grade = 'B';
        } else if (percentage >= 65) {
            grade = 'C';
        } else {
            grade = 'F';
        }
        System.out.println("Grade: " + grade);
        scanner.close();
	}

}
