package com.assignment.task1;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter your name : ");
        String name = scanner.nextLine();
        
        System.out.println("My name is : " + name);
        scanner.close();
	}

}
