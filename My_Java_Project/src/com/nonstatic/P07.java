//sample program of constructor
package com.nonstatic;

public class P07 {
	P07(){
		System.out.println("From constructor of P07");
	}
	public static void main(String[] args) {
		System.out.println("From main");
		P07 ob=new P07();
		System.out.println(new P07());
	}

}
