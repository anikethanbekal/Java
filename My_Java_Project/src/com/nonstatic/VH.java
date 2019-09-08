//Wap to create a class known as VH shirt(having propetirs String color ,int size, String product code) product code for first shirt is VN1,VN2.
//Create two constructor for the class one parametrized and one non-parametrized
package com.nonstatic;

public class VH {
	String color;
	int size;
	String productcode;
	static int count;
	{
		count++;
		productcode="VH"+count;
	}
	
	VH()
	{
		
	}
	VH(String color, int size)
	{
		this.color=color;
		this.size=size;
	}
	public static void main(String[] args) {
		VH v1=new VH("Blue",32);
		System.out.println("Color :"+v1.color+" Size "+v1.size+"Product: "+v1.productcode);
		VH v2=new VH("Black",32);
		System.out.println("Color :"+v2.color+" Size "+v2.size+"Product: "+v2.productcode);
		
	}
	
	
}
