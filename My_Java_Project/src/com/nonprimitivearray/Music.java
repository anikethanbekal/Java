//Music and songs
package com.nonprimitivearray;

public class Music {
	public static void main(String[] args) {
		Songs[] s= {new Songs("Teri Meri",4.2,"RFAK"),new Songs("Pal",4.3,"Arjit Singh")};
		for (Songs s2:s)
		{
			System.out.println("Title: "+s2.title);
			System.out.println("Singer: "+s2.singer);
			System.out.println("Duration: "+s2.duration);
			System.out.println();
		}
	}
}