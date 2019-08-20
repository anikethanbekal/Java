//WAP to design a method which will display all the factors of a number
package com.assignment;

public class MethodFactors {
	public static void display(int a) {
		for (int i =1;i<a;i++)
		{
			if(a%i ==0)
				System.out.println(i+" is a factor of "+a);
		}
	}

	public static void main(String[] args) {
		display(10);
		display(15);
		display(13);
	}

}
