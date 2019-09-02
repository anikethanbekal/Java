package com.staticmembers;
//Static program of static members using S06-S07

public class S07 {
	static int i =20;
	public static void main(String[] args) {
		int i =30;
		System.out.println(i);
		System.out.println(S07.i);
		System.out.println(S06.i);
	}

}
