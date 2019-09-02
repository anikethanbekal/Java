package com.nonstatic;

public class P02 {
	int i;
	void test()
	{
		System.out.println(i);
	}
	public static void main(String[] args) {
		P02 ob =new P02();
		ob.i =10;
		ob.test();
	}

}
