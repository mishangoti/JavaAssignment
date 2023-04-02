package com.assignment.task1;
import java.util.Scanner;


public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;

        System.out.println(num1 + " + " + num2 + " : " + sum);
        scanner.close();
	}

}
