package com.assignment.task2;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
