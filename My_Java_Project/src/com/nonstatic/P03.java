package com.nonstatic;

public class P03 {
	int i;
	void test () {
		System.out.println("from test()");
		System.out.println(i);
		System.out.println("this: "+this);
		i =20;
		System.out.println(this.i);
		System.out.println("End of test()");
	}

	public static void main(String[] args) {
		System.out.println("From main");
		P03 ob =new P03();
		ob.i = 10;
		ob.test();
		System.out.println("ob: "+ob);
		System.out.println("End Main");

	}

}
