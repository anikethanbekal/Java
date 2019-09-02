//Sample program for Static Method
package com.staticmembers;

public class S08 {
	static void test() { 						//Static method
		System.out.println("From test");
	}
	public static void main(String[] args) {	//Main method
		System.out.println("Main Starts");
		test(); //directly
		System.out.println("+++++");
		S08.test(); //by using class name
		System.out.println("Main Ends");
	}

}