//Sample program of nonstatic
package com.nonstatic;

public class Exercise {
	static int a;
	int b;
	public void test(){
		//accessing static inside non-static context
		System.out.println(a); //directly 
		Exercise.a = 200;  //using class name
		System.out.println(Exercise.a); 
		//accessing non-static member from non-static context
		System.out.println(this.b); //using this
		System.out.println(b); // directly

	}
	public static void main(String[] args) {
		//accessing static member inside static context
		System.out.println(a);//directly
		Exercise.a=20;
		System.out.println(Exercise.a);
		// accessing non-static
		Exercise e1 = new Exercise();
		e1.b =10; //by creating an object and using an object reference
		e1.test();
		System.out.println(e1.b);
		System.out.println(a);
	}
}