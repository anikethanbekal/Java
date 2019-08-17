/*A A A A A
 *B B B B 
 *C C C 
 *D D
 *E
 */
package com.assignment;

public class Pattern23{

	public static void main(String[] args) {
		int n =5;
		char c ='A';
		for (int i =0;i<n;i++)
		{
			for (int j =0;j<n;j++)
			{
				if (i+j<=(n-1))
					System.out.print(c+ " "); 
			}
			System.out.println();
			c++;
		}

	}

}