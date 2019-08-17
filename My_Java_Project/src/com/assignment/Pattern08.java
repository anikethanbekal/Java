/*        1
 *      2 2
 *    3 3 3
 *  4 4 4 4 
 *5 5 5 5 5
 */
package com.assignment;

public class Pattern08{

	public static void main(String[] args) {
		int k =1;
		int n =5;
		for (int i =0;i<n;i++)
		{
			for (int j =0;j<n;j++)
			{
				if (i+j>=(n-1))
					System.out.print(k );
				else
					System.out.print(" ");
			}
			k++;
			System.out.println();
		}

	}

}