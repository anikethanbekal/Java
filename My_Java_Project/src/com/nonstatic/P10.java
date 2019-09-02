//Sample program for parametrized constructor
package com.nonstatic;

public class P10 {
	double y;
	boolean x;
	P10(boolean x, double y)
	{
		this.y=y;
		this.x=x;
	}
	public static void main(String[] args) {
		P10 ob1 =new P10(false, 2.2);
		P10 ob2 =new P10(true, 3.7);
		P10 ob3 =new P10(false, 0.2);
		System.out.println("X: "+ob1.x+" Y: "+ob1.y);
		System.out.println("X: "+ob2.x+" Y: "+ob2.y);
		System.out.println("X: "+ob3.x+" Y: "+ob3.y);
		
	}

}
