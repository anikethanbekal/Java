//WAP to design a class representing an entity known as marker having the following properties 
//1) color 2) name 3)length: double 4)price : int 
//Design a method known as initialize to assign a value
//the method the value which are to be initialized.
//Note this problem is solved in two ways . another way is using Marker01
package com.nonstatic;

public class Marker{
	String color;
	String name;
	double length;
	int price;
	
	void initialize(String name,String color, double length, int price) {
		this.color=color;
		this.length =length;
		this.name =name;
		this.price=price;
		System.out.println("Name: "+this.name);
		System.out.println("Color: "+this.color);
		System.out.println("Price: "+this.price);
		System.out.println("Length: "+this.length+"\n");
		
	}
	public static void main(String[] args) {
		Marker m1=new Marker();
		m1.initialize("Rorito","Blue",3.3,100);
		Marker m2=new Marker();
		m2.initialize("Faber Castle","Blue",3.5,125);

	}

}
