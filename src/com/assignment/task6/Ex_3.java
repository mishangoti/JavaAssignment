package com.assignment.task6;

class Employee {
	String name;
	int yearOfJoining;
	double salary;
	String address;
	
	// constructor
	public Employee (String name, int yearOfJoining, double salary, String address) {
		this.name = name;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
		this.address = address;
	}
	
	// print
	public void printEmployeeTable() {
		System.out.format("%-10s | %-17d | %-20s%n", name, yearOfJoining, address);
	}
}

public class Ex_3 {
	public static void main(String[] args) {
		// 3. Write a program that would print the information (name, year of joining, salary, address) of three employees
		// by creating a class named 'Employee'. The output should be as follows:
//		Name       | Year of Joining   | Address             
//		---------- | ----------------- | --------------------
//		Robert     | 1994              | 64C- Walls Street    
//		Sam        | 2000              | 68D- Walls Street    
//		John       | 1999              | 26B- Walls Street    
		
		// create an object of an employee class
		Employee emp1 = new Employee("Robert", 1994, 5000.0, "64C- Walls Street");
		Employee emp2 = new Employee("Sam", 2000, 5500.0, "68D- Walls Street");
        Employee emp3 = new Employee("John", 1999, 5200.0, "26B- Walls Street");
        
        System.out.format("%-10s | %-17s | %-20s%n", "Name", "Year of Joining", "Address");
        System.out.format("%-10s | %-17s | %-20s%n", "----------", "-----------------", "--------------------");
        emp1.printEmployeeTable();
        emp2.printEmployeeTable();
        emp3.printEmployeeTable();
        
	}

}
