package com.assignment.task1;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double area = 3.14 * radius * radius;

        System.out.println("The area of the circle with radius " + radius + " is " + area);
        scanner.close();
	}

}
