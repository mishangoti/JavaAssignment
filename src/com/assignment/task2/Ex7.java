package com.assignment.task2;

import java.util.Scanner;

public class Ex7 {
	
	public static void main(String[] args) {
		// 7. Write a program in JAVA to break and continue if the following cases occur:
		// If the user enters a negative number just break the loop and print “It’s Over”
		// If the user enters a positive number just continue in the loop and print “Good Going”
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("Enter a Number: ");
			int num = scanner.nextInt();
			
			if(num < 0) {
				System.out.println("It's Over");
				scanner.close();
				break;				
			} else if(num > 0) {		
				System.out.println("Good Going");
				continue;
			}
		}
	}

}
