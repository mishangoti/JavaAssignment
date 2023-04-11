package com.assignment.task4;

import java.util.Scanner;

public class Ex_3 {

	public static void main(String[] args) {
		// 3. Write a program to find out whether a given integer is present in an array or not.(By Linear Search)
		Scanner input = new Scanner(System.in);
		int[] array = {5, 6, 3, 7, 8, 19, 29, 334, 2, 1};
		
		System.out.print("Enter a number you want to search : ");
        int num = input.nextInt();
        
        boolean isFound = false;
        for (int i = 0; i < array.length; i++) {
        	if(array[i] == num) {
        		isFound = true;
        		break;
        	}
        }
        
        if (isFound) {
            System.out.println(num + " Found.");
        } else {
            System.out.println(num + " Not Found.");
        }
        input.close();
 	}

}
