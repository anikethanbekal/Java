package com.nonprimitivearray;

public class F extends E {
	int y;
	public static void main(String[] args) {
		F ob1 =new F();
		System.out.println("X: "+ob1.x);
		System.out.println("Y: "+ob1.y);
		System.out.println(ob1);
		E ob2 =new E();
		System.out.println("X: "+ob2.x);
		//System.out.println("Y: "+ob2.y);
		ob2.x=200;
		System.out.println("X: "+ob2.x);
		System.out.println(ob2);
		
	}

}
