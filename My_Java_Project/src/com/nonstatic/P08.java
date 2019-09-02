//Sample program of constructor
package com.nonstatic;

public class P08 {
	int j;
	static int i;
	P08(){							//Constructor is a non-static context
		i=10;						//accessing static member directly
		System.out.println(P08.i);	//accessing static member using class name	
		System.out.println(j);		//accessing non static member directly
		j=20;
		System.out.println(this.j);	//accessing non static member using this
		System.out.println(this);	//address
	}
	public static void main(String[] args) {
		P08 ob=new P08();
	}
}
