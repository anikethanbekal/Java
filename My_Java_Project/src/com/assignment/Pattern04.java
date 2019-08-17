/*01 02 03 04 05    
 *06 07 08 09
 *10 11 12 
 *13 14
 *15
 */
package com.assignment;

public class Pattern04 {

	public static void main(String[] args) {
		int k =1;
		int n =5;
		for (int i =0;i<n;i++)
		{
			for (int j =0;j<n;j++)
			{
				if (i<=j)
					System.out.print(k++ + " ");
			}
			System.out.println();
		}

	}

}
