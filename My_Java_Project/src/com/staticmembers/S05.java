//Sample program of static members
package com.staticmembers;

public class S05 {
	static int a =10; //class static variable

	public static void main(String[] args) {
		int a =20; //local variable
		System.out.println(a); //referring to local variable
		System.out.println(S05.a);
	}

}