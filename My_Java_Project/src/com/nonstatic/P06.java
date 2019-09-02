//Create a class having integer property.
//Design a method which is used to initialize the integer property.
//The method showed accept the value which is to be initialized to the property
package com.nonstatic;

public class P06 {
	int i ;
	void initialize(int a)
	{
		i=a;
		System.out.println("i: "+i);
	}
	public static void main(String[] args) {
		P06 ob=new P06();
		ob.initialize(10);
	}
}
