package com.nonstatic;

public class P04 {
	int i ;
	void test()
	{
		int i =30;
		System.out.println(i);
		System.out.println(this.i);
	}
	public static void main(String[] args) {
		P04 ob1=new P04();
		ob1.test();
		P04 ob2 =new P04();
		ob2.i=30;
		ob2.test();
	}

}
