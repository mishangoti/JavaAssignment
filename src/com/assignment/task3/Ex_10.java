package com.assignment.task3;

public class Ex_10 {

	public static void main(String[] args) {
		// 10. Print the following pattern
		// *                   *
		// * * *           * * *
		// * * * * *   * * * * *
		// * * * * * * * * * * *
		
		int row = 4;
		for(int i = 1; i <= row; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			for (int j = 1; j <= (row-i)*2; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (row-i)*2; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}


