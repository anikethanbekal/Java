//Sample program of static methods in Employee-Company
package com.staticmembers;

public class Company {
	public static void main(String[] args) {
		Employee.name ="Chikku";
		Employee.id =01;
		System.out.println(Employee.name+" has "+ Employee.id+" as the employee id");
		Employee.name="Chikki";
		Employee.id=2;
		System.out.println(Employee.name+" has "+ Employee.id+" as the employee id");
	}

}
