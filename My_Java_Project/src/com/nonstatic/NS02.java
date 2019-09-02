//Sample program of non-static variable.To display the object address and create new object without ref. variable.
package com.nonstatic;

public class NS02 {
	int i ; //non-static global variable
	public static void main(String[] args) {
		NS02 ob = new NS02();
		System.out.println(ob.i); //10
		// to get the address of object ob
		System.out.println(ob);
		//To create a new object and displaying its address
		System.out.println(new NS02());
	}

}
