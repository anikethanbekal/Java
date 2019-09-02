//Sample program of constructor overloading
package com.nonstatic;

public class A {
	A() 				//user defined non-parameterized constructor
	{
		System.out.println("From A()");
	}
	A(int i)			//user defined parameterized constructor
	{
		this();
		System.out.println("From A(int)");
	}
	public static void main(String[] args) {
		A ob1 =new A();
		System.out.println("___________________");
		A ob2 =new A(10);
	}
}
