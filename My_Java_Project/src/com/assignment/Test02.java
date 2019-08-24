/*Test program
 * 0
 * 1 0
 * 1 0 1
 * 0 1 0 1
 */

package com.assignment;

public class Test02{
	public static void main(String[] args) {
		int n =4;
		int k=0;
		for (int i =0;i<n;i++)
		{
			for (int j=0;j<n;j++)
			{
				if(i>=j)
				{
					if (k%2==0)
						System.out.print(0);
					else
						System.out.print(1);
					k++;
				}
				
			}
			System.out.println();
		}
		
	}
	
}
