// Sample primitive type casting program
package com.primitivetypecasting;

public class P1 {

	public static void main(String[] args) {
		char a ='f';
		int b =a;
		System.out.println(a); //f
		System.out.println(b); //102
		System.out.println(a+2); //104
		
		int i = 10;
		double d =(double) i;// use of cast operator not mandatory here.
		System.out.println(i); //10
		System.out.println(d); //10.0
		System.out.println(i+20.0); //32.0 (double)
		
		int j =10;
		System.out.println(j/2.0);//5.0
		System.out.println(j+2.0);//12.0
		
		int k = 12;
		float l =2.0f;
		float y = k/l;
		System.out.println(y); // 6.0 (float)
	}

}
