package com.nonstatic;

public class Company01 {
	public static void main(String[] args) {
		Employee01 e1= new Employee01();
		System.out.println("Id of "+e1.name+" is "+e1.id+" his salary is "+e1.salary);
		Employee01 e2= new Employee01(02,"BEA",20.5);
		System.out.println("Id of "+e2.name+" is "+e2.id+" his salary is "+e2.salary);
		
	}

}
