/*A
 *B B
 *C C C
 *D D D D
 *E E E E E
 */
package com.assignment;

public class Pattern21{

	public static void main(String[] args) {
		int n =5;
		char c ='A';
		for (int i =0;i<n;i++)
		{
			for (int j =0;j<n;j++)
			{
				if (i>=j)
					System.out.print(c + " ");
			}
			System.out.println();
			c++;
		}

	}

}