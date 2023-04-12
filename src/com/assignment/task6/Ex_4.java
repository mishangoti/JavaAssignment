package com.assignment.task6;

class Student1 {
	String name;
	
	// constructor with no argument
	public Student1() {
		this.name = "Unknown";
	}
	
	// constructor with argument
	public Student1(String name) {
		this.name = name;
	}
	
	public void printStudentName() {
		System.out.println("Student Name: " + name);
	}
}

public class Ex_4 {

	public static void main(String[] args) {
		// 4. Write a program to print the names of students by creating a Student class. If no name is passed while
		// creating an object of Student class, then the name should be "Unknown", otherwise the name should be
		// equal to the String value passed while creating an object of Student class. (Hint: Overloading concept)
		
		Student1 student1 = new Student1();
		Student1 student2 = new Student1("Mishan");
		Student1 student3 = new Student1("Goti");
		Student1 student4 = new Student1();
		
		student1.printStudentName();
		student2.printStudentName();
		student3.printStudentName();
		student4.printStudentName();
	}

}
