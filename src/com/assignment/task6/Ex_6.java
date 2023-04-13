package com.assignment.task6;

class Complex {
	double real;
	double imaginary;
	
	public Complex() {
		this.real = 0;
        this.imaginary = 0;
	}
	
	public Complex (double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public Complex(double num) {
        this.real = num;
        this.imaginary = num;
    }
	
	public Complex add(Complex c2) {
		double sumReal = this.real + c2.real;
		double sumImaginary = this.imaginary + c2.imaginary;
		return new Complex(sumReal, sumImaginary);
	}
	
	public Complex substract(Complex c2) {
		double diffReal = this.real - c2.real;
		double diffImaginary = this.imaginary - c2.imaginary;
		return new Complex(diffReal, diffImaginary);
	}
	
	public Complex multiply(Complex c2) {
		double productReal = this.real * c2.real;
		double productImaginary = this.imaginary * c2.imaginary;
		return new Complex(productReal, productImaginary);
	}
	
	public void display() {
        System.out.println(real + " + " + imaginary + "i");
    }
}

public class Ex_6 {

	public static void main(String[] args) {
		// 6. Print the sum, difference, and product of two complex numbers by creating a class named 'Complex' with
		// separate methods for each operation whose real and imaginary parts are entered by the user.
		Complex c1 = Complex(2.5, 5.5);
		Complex c2 = Complex(3.5, 4.5);
		
		Complex sum = c1.add(c2); 
		Complex difference = c1.substract(c2);
		Complex multiply = c1.multiply(c2);
		
		System.out.println("Sum: ");
        sum.display();
        System.out.println("Difference: ");
        difference.display();
        System.out.println("Product: ");
        multiply.display();
	}
}
