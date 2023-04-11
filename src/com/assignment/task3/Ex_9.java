package com.assignment.task3;

import java.util.Scanner;

public class Ex_9 {

	public static void main(String[] args) {
		// 9. Print the following pattern
//			*
//		   * *
//		  *   *
//		 *     *
//		*       *
//		 *     *
//		  *   *
//		   * *
//	 	    * 
		
		Scanner input = new Scanner(System.in);  
		System.out.print("Enter the number of rows: ");  
		int rows = input.nextInt();  

		for (int i = 1; i <= rows; i++) {
			for (int j = rows; j>i; j--) {
				System.out.print(" ");
			}
			System.out.print("*");
			for (int j = 1; j < (i-1)*2; j++) {
				System.out.print(" ");
			}
			if(i == 1) {
				System.out.print("\n");  
			} else {
				System.out.print("*"+"\n");  
			}
		}
		for(int i=rows-1; i>=1; i--)  
		{  
			for(int j=rows; j>i; j--)  
			{  
				System.out.print(" ");  
			}  
			System.out.print("*");  
			for(int j=1; j<(i-1)*2; j++)  
			{  
				System.out.print(" ");  
			}  
			if(i==1)  
			{  
				System.out.print("\n");  
			}  
			else  
			{  
				System.out.print("*"+"\n");  
			}  
		} 
		input.close();
	}

}
