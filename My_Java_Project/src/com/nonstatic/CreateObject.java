//Program for non-static members
package com.nonstatic;

public class D {
	int i;
	int j;
	D(){					//non-parameterized constructor
		
	}
	D(int i,int j)			//parameterized constructor
	{
		this.i =i;
		this.j=j;
	}
	static D generateObject(int i,int j)		//creating object 
	{
		return new D(i,j);
	}
	D initialize(int i, int j)					//initializing the object created		
	{
		this.i=i;
		this.j=j;
		return this;
	}
	void display()								//displaying the output
	{
		System.out.println("i: "+this.i);
		System.out.println("j: "+this.j);
	}
	public static void main(String[] args) {
		D ob =D.generateObject(10,20);
		ob.display();
		ob.initialize(200, 300).display();
	}
}
