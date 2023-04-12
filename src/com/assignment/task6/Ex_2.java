package com.assignment.task6;

class Triangle {
	int side1;
	int side2;
	int side3;
	
	// constructore
	public Triangle() {
		side1 = 3;
		side2 = 4;
		side3 = 5;
	}
	
	// Method to calculate area
	public double area() {
		double s = (side1 + side2 + side3) / 2.0;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}
	
	// Method to calculate perimeter
	public int perimeter () {
		return side1 + side2 + side3;
	}
}

public class Ex_2 {

	public static void main(String[] args) {
		// 2. Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by
		// creating a class named 'Triangle' without any parameter in its constructor.
		Triangle tri = new Triangle();
		
		System.out.println("Area: " + tri.area());
		System.out.println("Perimeter: " + tri.perimeter());
	}

}
