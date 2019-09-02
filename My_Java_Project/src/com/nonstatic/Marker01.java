//WAP to design a class representing an entity known as marker having the following properties 
//1) color 2) name 3)length: double 4)price : int 
//Design a method known as initialize to assign a value
//the method the value which are to be initialized.
package com.nonstatic;

public class Marker01 { 
	String name;
	String color;
	double lenth;
	int price;
	void initialize(String name,String color,double length, int price)
	{
		this.color=color;
		this.lenth=length;
		this.name=name;
		this.price=price;
		System.out.println("Name: "+this.name);
		System.out.println("Color: "+this.color);
		System.out.println("Length: "+this.lenth);
		System.out.println("Price: "+this.price);
	}
	public static void main(String[] args) {
		Marker01 m1=new Marker01();
		m1.initialize("Faber Castle", "Blue", 3.5, 100);
		Marker01 m2=new Marker01();
		m2.initialize("Rorito", "Black", 3.0, 125);
	}

}
