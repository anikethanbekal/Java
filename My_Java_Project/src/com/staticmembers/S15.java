//Sample program of static block. and using a variables with same name as global and local variables
package com.staticmembers;

public class S15 {
	static int i=10;
	static {
		int i =20;
		System.out.println(i);
		System.out.println(S13.i);
	}

	public static void main(String[] args) {
	System.out.println(i);

	}

}
