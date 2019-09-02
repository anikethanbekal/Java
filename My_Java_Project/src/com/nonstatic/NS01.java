//Sample program of non-static variable
package com.nonstatic;

public class NS01 {
	int i; //non-static variable
	public static void main(String[] args) {
		NS01 ob = new NS01(); //object creation
		ob.i=10; //Assigning value to i
		System.out.println(ob.i);
	}

}
