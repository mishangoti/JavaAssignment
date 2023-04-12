package com.assignment.task6;

class Rectangle {
	int length;
	int breadth;
	
	public Rectangle() {
		this.length = 0;
		this.breadth = 0;
	}
	
	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public Rectangle(int side) {
		this.length = side;
		this.breadth = side;
	}
	
	public int calculateArea() {
		return length * breadth;
	}
}

public class Ex_5 {

	public static void main(String[] args) {
		// 5. Create a class named 'Rectangle' with two data members- length and breadth and a method to calculate the
		// area which is 'length*breadth'. The class has three constructors which are :
		// 1. having no parameter - values of both length and breadth are assigned zero.
		// 2. having two numbers as parameters - the two numbers are assigned as length and breadth respectively.
		// 3. having one number as a parameter - both length and breadth are assigned that number.
		Rectangle rectangle1 = new Rectangle();
		Rectangle rectangle2 = new Rectangle(5, 7);
		Rectangle rectangle3 = new Rectangle(7);
		
		System.out.println("Area of reactangle1 : " + rectangle1.calculateArea());
		System.out.println("Area of reactangle2 : " + rectangle2.calculateArea());
		System.out.println("Area of reactangle3 : " + rectangle3.calculateArea());
	}

}
