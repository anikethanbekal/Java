package com.nonstatic;

public class P09 {
	int i;
	P09(){
		i=10;
	}
	public static void main(String[] args) {
		P09 p1= new P09();
		P09 p2= new P09();
		P09 p3= new P09();
		System.out.println("i value for my 1st object = "+p1.i);
		System.out.println("i value for my 1st object = "+p2.i);
		System.out.println("i value for my 1st object = "+p3.i);
				
	}
}
