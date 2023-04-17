package com.assignment.task7;

public class Ex_5 {

	public static void main(String[] args) {
		// 5. Program to check the Armstrong number?
		// 153 = 1*1*1 + 5*5*5 + 3*3*3 // digits is 3
		// abc = a^3 + b^3 + c^3


		int num1 = 153;
        int num2 = 1634;
        int num3 = 1635;

        System.out.println(num1 + " is an Armstrong number? " + isArmstrong(num1));
        System.out.println(num2 + " is an Armstrong number? " + isArmstrong(num2));
        System.out.println(num3 + " is an Armstrong number? " + isArmstrong(num3));

	}
	
	public static boolean isArmstrong(int num) {
		String numStr = String.valueOf(num);
		int n = numStr.length();
		
		int sum = 0;
		for(int i = 0; i < n; i++) {
			// get digits of number
			int digit = Character.getNumericValue(numStr.charAt(i));
			sum += Math.pow(digit, n);
		}
		
		return sum == num;
	}
}
