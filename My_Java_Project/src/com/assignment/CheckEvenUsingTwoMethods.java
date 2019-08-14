/* Design two methods the first name printEven this method should print even no's upto given limit 
and to check if a given no's even or not you should design a method known as isEven. Call printEven 
from main method
*/
package com.assignment;

public class CheckEvenUsingTwoMethods {
	//Method to check even or no i.e isEven method
	public static boolean isEven(int a)
	{
		if (a%2==0)
			return true;
		else
			return false;
	}
	//method to print the even no's i.e printEven
	public static void printEven(int b)
	{
		for (int a =0; a<b;a++)
		{
			if (isEven(a))
				System.out.println(a);
		}
	}
	// main method to call printEven
	public static void main(String[] args) {
		printEven(100);
	}

}
