//WAP to design a method to print all the prime no's upto 25
package com.assignment;

public class MethodPrime {
	//Method to print prime no's
	public static void printPrime(int a){
		for (int i=2;i<a;i++)
		{
			if (isPrime(i))
				System.out.println(i);
		}
		
	}
	// Method to check the prime no's
	public static boolean isPrime(int n){
		for (int i=2;i<n;i++) {
			if (n%i ==0)
			{
				return false;
			}
		}
		return true;
		
	}
	//Method to give input
	public static void main(String[] args) {
		printPrime(255);

	}

}
