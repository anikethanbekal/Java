/*Test Program
 * EDCBA
 * DCBA
 * CBA
 * BA
 * A
 */
package com.assignment;

public class Test01{
	public static void main(String[] args) {
		int n=5;
		char c='E';char ch=c;
		for (int i=0;i<n;i++)
		{
			for (int j=0;j<n;j++)
			{
				if(i+j<=(n-1))
					System.out.print(c--);
			}
			ch--;
			c=ch;
			System.out.println();
		}	
		
	}
	
}