package com.assignment.task2;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your income: ");
        double income = scanner.nextDouble();

        double tax = 0;

        if (income > 250000 && income <= 600000) {
            tax = (income - 250000) * 0.1;
        } else if (income > 600000 && income <= 1200000) {
            tax = 35000 + (income - 600000) * 0.18;
        } else if (income > 1200000) {
            tax = 125000 + (income - 1200000) * 0.25;
        }

        System.out.println("Income: " + income);
        System.out.println("Tax: " + tax);
        scanner.close();
	}

}
