//Write a program to design a method which can display even numbers from a given value to a given value
package com.assignment;

public class DisplayEven {
    //printEven method to check and display the output
	public static void printEven(int a, int b){
		for(; a<b; a++)
			{ 
			if (a%2==0)
			System.out.println(a);
			}
		if (a>b)
			System.out.println("Please give first value lesser than second value");
			
		}
	//main method to give user values
	public static void main(String[] args) {
		printEven(20,500);
	}

}
