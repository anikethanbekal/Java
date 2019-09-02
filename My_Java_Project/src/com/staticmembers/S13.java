//sample program of static block
package com.staticmembers;

public class S13 {
	static int i;
	static 
	{
		System.out.println(i); // default value 0
		i=20; //reinitializing
	}
	public static void main(String[] args) {
		System.out.println(i);//20
	}
	
}