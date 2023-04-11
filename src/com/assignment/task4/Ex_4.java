package com.assignment.task4;
import java.util.Arrays;

import java.util.Scanner;

public class Ex_4 {

	public static void main(String[] args) {
		// 4. Write a program to find out whether a given integer is present in an array or not.(By Binary Search)
		
        Scanner input = new Scanner(System.in);

		int[] array = {2, 5, 7, 9, 12, 15, 18};
		
		System.out.print("Enter a number to search for: ");
        int num = input.nextInt();
        int index = Arrays.binarySearch(array, num);
        
        if (index >= 0) {
            System.out.println(num + " found at index: " + index);
        } else {
            System.out.println(num + " wnot found.");
        }
        input.close();
	}

}
