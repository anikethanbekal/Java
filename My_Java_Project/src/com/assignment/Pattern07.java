/*1 1 1 1 1
 *2 2 2 2
 *3 3 3 
 *4 4
 *5 
 */
package com.assignment;

public class Pattern07{

	public static void main(String[] args) {
		int k =1;
		int n =5;
		for (int i =0;i<n;i++)
		{
			for (int j =0;j<n;j++)
			{
				if (i+j<=(n-1))
					System.out.print(k + " ");
			}
			k++;
			System.out.println();
		}

	}

}
