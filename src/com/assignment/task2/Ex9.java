package com.assignment.task2;

import java.util.Scanner;

public class Ex9 {
	
	public static void main(String[] args) {
		// Write a program to input electricity unit charges and calculate total electricity bill according to the given condition:
		// For first 60 units Rs. 0.30/unit
		// For next 90 units Rs. 0.75/unit
		// For next 120 units Rs. 1.10/unit
		// For unit above 300 Rs. 2.50/unit
		// An additional surcharge of 20% is
		// added to the bill
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of units consumed: ");
        int units = scanner.nextInt();

        double bill = 0;

        if (units <= 60) {
            bill = units * 0.30;
        } else if (units > 60 && units <= 150) {
            bill = 60 * 0.30 + (units - 60) * 0.75;
        } else if (units > 150 && units <= 270) {
            bill = 60 * 0.30 + 90 * 0.75 + (units - 150) * 1.10;
        } else if (units > 270) {
            bill = 60 * 0.30 + 90 * 0.75 + 120 * 1.10 + (units - 270) * 2.50;
        }

        double surcharge = bill * 0.20;
        double total = bill + surcharge;

        System.out.println("Total units consumed: " + units);
        System.out.println("Total bill amount (excluding surcharge): Rs. " + bill);
        System.out.println("Surcharge (20%): Rs. " + surcharge);
        System.out.println("Total bill amount (including surcharge): Rs. " + total);
        scanner.close();
	}

}
