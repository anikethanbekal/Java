/* Test Program
 * 1
 * 1 0
 * 1 0 1
 * 1 0 1 0
 */
package com.assignment;

public class Test03{
	public static void main(String[] args) {
		int n =4;
		for (int i =0;i<n;i++)
		{
			for (int j=0;j<n;j++)
			{
				if(i>=j)
				{
					if (j%2==0)
						System.out.print(1);
					else
						System.out.print(0);
				}
				
			}
			System.out.println();
		}
		
	}
	
}
