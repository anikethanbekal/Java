package com.assignment;
/* 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 * 11 12 13 14 15
 */
public class Pattern01 {

	public static void main(String[] args) {
		int k =1;
		int n =5;
		for (int i =0;i<n;i++)
		{
			for (int j =0;j<n;j++)
			{
				if (i>=j)
					System.out.print(k++ + " ");
			}
			System.out.println();
		}

	}

}
