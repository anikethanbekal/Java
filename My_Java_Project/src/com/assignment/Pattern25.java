/* A
 * * * 
 * B B B 
 * * * * *
 * C C C C C
 */
package com.assignment;

public class Pattern25{

	public static void main(String[] args) {
		int n =5;
		char c ='A';
		for (int i =0;i<n;i++)
		{
			for (int j =0;j<n;j++)
			{
				if (i>=j)
					if ( i%2 ==0)
						System.out.print(c);
					else
						System.out.print("*");
			}
			if (i%2==1)
				c++;
			System.out.println();
			
		}

	}

}