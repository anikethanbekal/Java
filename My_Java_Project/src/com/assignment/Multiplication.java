/*write a program to design method to perform multiplication of
a) two integers
b) two decimal
c) three integers
*/
package com.assignment;
public class Multiplication {
	// Method to perform multiplication of two integers
	public static void product(int a ,int b) {
		int c = a*b;
		System.out.println("Product of "+ a +" and "+b + " is "+ c );
	}
	// Method to perform multiplication of two decimal numbers
	public static void product(double a ,double b) {
		double c = a*b;
		System.out.println("Product of "+ a +" and "+b + " is "+ c );
	}
	// Method to perform multiplication of three integers
	public static void product(int a ,int b,int c) {
		int d = a*b*c;
		System.out.println("Product of "+a + ","+b+" and "+ c + " is " + d);
	}
	//Main method
	public static void main(String[] args) {
		product(20, 10);
		product(5.2, 6.8);
		product(2,10,5);

	}

}
