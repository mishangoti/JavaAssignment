package com.assignment.task2;

import java.util.Scanner;

public class Ex10 {
	
	public static void main(String[] args) {
		// 10. Write a program to input basic salary of an employee and calculate its Gross salary according to following:
		// Basic Salary <= 15000 : HRA = 25%,
		// DA = 82%
		// Basic Salary <= 20200 : HRA = 27%,
		// DA = 90%
		// Basic Salary > 20200 : HRA = 36%, DA
		// = 95%
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the basic salary: ");
        double basicSalary = scanner.nextDouble();

        double hra, da;

        if (basicSalary <= 15000) {
            hra = 0.25 * basicSalary;
            da = 0.82 * basicSalary;
        } else if (basicSalary <= 20200) {
            hra = 0.27 * basicSalary;
            da = 0.9 * basicSalary;
        } else {
            hra = 0.36 * basicSalary;
            da = 0.95 * basicSalary;
        }

        double grossSalary = basicSalary + hra + da;

        System.out.println("Gross salary: " + grossSalary);
        scanner.close();
	}

}
