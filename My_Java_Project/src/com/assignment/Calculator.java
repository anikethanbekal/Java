//WAP to design a calculator which can perform addition, multiplication, division,subtraction and modulus.
package com.assignment;

public class Calculator {
	//To perform addition of two integers
	public static void addition(int a, int b) {
		int sum =a+b;
		System.out.println("Sum of " +a+" and "+b+" is "+sum);
	}
	//To perform multiplication of two integers
	public static void multiplication(int a, int b) {
		int pro =a*b;
		System.out.println("Product of " +a+" and "+b+" is "+pro);
	}
	//To perform division of two integers
	public static void division(int a, int b) {
		int div =a/b;
		System.out.println("Division of " +a+" and "+b+" is "+div);
	}
	//To perform subtraction of two integers
	public static void subtraction(int a, int b) {
		int sub =a-b;
		System.out.println("Difference between " +a+" and "+b+" is "+sub);
	}
	//To perform modulus(remainder) of two integers
	public static void modulus(int a, int b) {
		int mod =a%b;
		System.out.println("Modulus of " +a+" and "+b+" is "+mod);
	}
	//Main method to call all the methods
	public static void main(String[] args) {
		addition(10, 20);
		multiplication(10, 20);
		division(100,20);
		subtraction(100, 20);
		modulus(10, 20);
	}

}
