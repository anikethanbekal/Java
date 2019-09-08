/*WAP to design the following scenarios 
 * create a class known as employee01 having following properties i)ID ii)name iii) salary
 * design two constructors one is parametrized and other non parameterized.
 * create the object of employee01 in another classs known as company
 */
package com.nonstatic;

public class Employee01 {
	int id;
	String name;
	double salary;
	Employee01() {
		id =10;
		name ="ABC";
		salary = 10.0;
	}
	Employee01(int id, String name, double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}

}
