//Sample program of getter and setter
package com.encapsulation;

public class Employee {
	String name;
	private double salary;
	private double getsalary()			//getter method	
	{		
		return salary;
	}
	public void setsalary(double salary) {			//setter method
		if (salary>this.salary)
		{
			this.salary=salary;
		}
		else
			System.out.println("Entered salary is unacceptable");
	}
	int id;
	public Employee(String name, double salary,int id)
	{
		this.name=name;
		this.salary=salary;
		this.id =id;
	}
	public static void main(String[] args) {			//main method
		Employee e1= new Employee("ABC", 15000, 01);
		System.out.println("Salary of "+e1.name+" is "+e1.getsalary()+" and id is "+e1.id);
		e1.setsalary(25000.0);																//set salary to 25000
		System.out.println("Salary of "+e1.name+" is "+e1.getsalary()+" and id is "+e1.id);
	}
}
