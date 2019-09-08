// WAP to store all the factors of a number in an array
package com.numbertheory;

public class N2 {

	public static void main(String[] args) {
		int count = 0; 
		int n = 155;
		//To count the number of factors
		for (int i =1; i<=n; i++)
		{
			if (n%i==0)
			{
				count++;
			}
		}
		//To create array
		int[] factors=new int[count];
		// To store the factors in the array
		for (int i=0, j=1; i<factors.length;j++)
		{
			if (n%j==0)
			{
				factors [i] =j;
				i++;
			}
		}
		// To display the array
		for (int i=0; i<factors.length;i++)
		{
			System.out.println(factors[i]);
		}
	}

}
