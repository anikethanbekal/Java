//Sample program of constructor overloading
package com.nonstatic;

public class B {
	B()
	{
		System.out.println("From B()");
	}
	B(int i)
	{
		this();
		System.out.println("From B(int)");
	}
	public static void main(String[] args) {
		B ob1 =new B();
		System.out.println("___________________");
		B ob2 =new B(10);
	}
}