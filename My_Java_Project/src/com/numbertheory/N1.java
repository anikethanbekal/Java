//WAP to find the factors of a given numbers
package com.numbertheory;

public class N1 {

	public static void main(String[] args) {
		int n = 15;
		for (int i=1; i<n;i++)
		{
			if (n%i==0)
			{
				System.out.println(i + " is a factor of " + n);
			}
		}

	}
}
