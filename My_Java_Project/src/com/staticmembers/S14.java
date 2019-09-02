//sample program for compile time error for local variable
package com.staticmembers;

public class S14 {
	static {
		int i =20;//local variable
		System.out.println(i);
	}

	public static void main(String[] args) {
		System.out.println("From Main");
		//System.out.println(i); //CTE

	}

}
