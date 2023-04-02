package com.assignment.task2;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// 2. Write a program to check whether a character is an alphabet or not.
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is an alphabet.");
        } else {
            System.out.println(ch + " is not an alphabet.");
        }
        scanner.close();
	}

}
