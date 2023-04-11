package com.assignment.task4;

import java.util.Scanner;

public class Ex_5 {

	public static void main(String[] args) {
		// 5. Write a Java program to add two matrices of the same size.
		Scanner input = new Scanner(System.in);

        int[][] firstMatrix = new int[3][3];
        int[][] secondMatrix = new int[3][3];
        
        
        firstMatrix[0][0] = 24;
        firstMatrix[0][1] = 62;
        firstMatrix[0][2] = 22;
        firstMatrix[1][0] = 82;
        firstMatrix[1][1] = 54;
        firstMatrix[1][2] = 26;
        firstMatrix[2][0] = 32;
        firstMatrix[2][1] = 19;
        firstMatrix[2][2] = 43;
        
        secondMatrix[0][0] = 44;
        secondMatrix[0][1] = 26;
        secondMatrix[0][2] = 21;
        secondMatrix[1][0] = 24;
        secondMatrix[1][1] = 44;
        secondMatrix[1][2] = 24;
        secondMatrix[2][0] = 52;
        secondMatrix[2][1] = 79;
        secondMatrix[2][2] = 63;
        
        // print matrix 1 and 2
        System.out.println("First matrices is: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(firstMatrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Second matrices is: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(secondMatrix[i][j] + " ");
            }
            System.out.println();
        }
        
        // addition of matrix
        int[][] resultMatrix = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                resultMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }
        
        // print result matrix 
        System.out.println("Result of matrices addition of first and second is: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
        input.close();
	}

}
