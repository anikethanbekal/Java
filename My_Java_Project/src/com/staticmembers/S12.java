//Sample program of Static block
package com.staticmembers;

public class S12 {
	static {									//Static block-1
		System.out.println("SIB-2");
	}
	public static void main(String[] args) {	//main method
		System.out.println("from main");
	}
	static {									//Static block-2
		System.out.println("SIB-1");
	}
	
}