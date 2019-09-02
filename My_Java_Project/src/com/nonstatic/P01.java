package com.nonstatic;

public class P01 {
	void test()
	{
		System.out.println("from test()");
	}
	public static void main(String[] args) {
		System.out.println("from main");		
		P01 ob1 =new P01();
		ob1.test();
		System.out.println("Main ends");
	}
}
