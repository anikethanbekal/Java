//sample program of non-static members NS03-NS04
package com.nonstatic;

public class NS04 {
	public static void main(String[] args) {
		NS03 ob1 = new NS03();
		System.out.println("i: "+ob1.i+"\nj: "+ob1.j);
		NS03 ob2 = new NS03();
		ob2.i=10;
		ob2.j=20;
		System.out.println("i: " + ob2.i+"\nj: "+ob2.j);
		NS03 ob3 = new NS03();
		ob3.i=30;
		ob3.j=40;
		System.out.println("i: " + ob3.i+"\nj: "+ob3.j);

		
	}

}
