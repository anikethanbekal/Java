//Wap to create a class known as VH shirt(having propetirs String color ,int size, String product code) product code for first shirt is VN1,VN2.
//Create two constructor for the class one parametrized and one non-parametrized using this() statement.
package com.nonstatic;

public class VH02 {
	String color;
	int size;
	String productcode;
	static int count;
	
	VH02()
	{
		count++;
		productcode="VH"+count;
	}
	VH02(String color, int size)
	{
		this();
		this.color=color;
		this.size=size;
	}
	public static void main(String[] args) {
		VH02 v1=new VH02("Blue",42);
		System.out.println("Color :"+v1.color+" Size "+v1.size+" Product: "+v1.productcode);
		VH02 v2=new VH02("Black",40);
		System.out.println("Color :"+v2.color+" Size "+v2.size+" Product: "+v2.productcode);
		VH02 v3=new VH02("Sky Blue",40);
		System.out.println("Color :"+v3.color+" Size "+v3.size+" Product: "+v3.productcode);
	}
}
