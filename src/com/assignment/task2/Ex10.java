package com.assignment.task2;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
