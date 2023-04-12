package com.assignment.task6;

class Student {
	String name;
	int enrollment;
}
public class Ex_1 {

	public static void main(String[] args) {
		// 1. Create a class named 'Student' with String variable 'name' and integer variable 'EnrollmentNo'. Assign the
		// value of EnrollmentNo as '132' and that of name as "Amay" by creating an object of the class Student, And
		//Print the details of Amay.
		Student student = new Student();
		
		student.name = "Amay";
		student.enrollment = 132;
		
		System.out.println("Name: " + student.name);
		System.out.println("Entrollment: " + student.enrollment);
		
	}

}
