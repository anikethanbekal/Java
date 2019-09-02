//sample program for ways to access static members within same class
package com.staticmembers;

public class S03 {
	static int i = 10;
	public static void main(String[] args) {
		System.out.println(i); //directly
		System.out.println(S03.i);//using class name
		S03.i = 30;
		System.out.println(i);
	}

}
