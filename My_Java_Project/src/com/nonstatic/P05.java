package com.nonstatic;

public class P05 {
	int a;
	void m1() {
		int a =300;
		System.out.println(this.a);
		this.a =a;
		System.out.println(a);
		System.out.println(this.a);
	}
	public static void main(String[] args) {
		P05 ob1= new P05();
		ob1.a=20;
		ob1.m1();
		P05 ob2 = new P05();
		System.out.println(ob2.a);
		ob2.a =30;
		System.out.println(ob2.a);
		ob2.m1();
	}

}
