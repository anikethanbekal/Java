/*1
 *2 3
 *4 5 6
 *7 8 9 0
 *1 2 3 4 5
 */
package com.assignment;

public class Pattern33{

	public static void main(String[] args) {
		int k =1;
		int n =5;
		for (int i =0;i<n;i++)
		{
			for (int j =0;j<n;j++)
			{
				if (i>=j) 
					System.out.print(k++%10);
			}
		
			System.out.println();
			
		}

	}

}