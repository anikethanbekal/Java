//Sample program of static methods in Employee-Company
package com.nonstatic;

public class Company {

	public static void main(String[] args) {
		Employee e1 = new Employee();				//Creation of employee1
		e1.name="ABC";								//Assigning name to employee 1
		e1.id =1;									//Assigning id no to employee 1
		System.out.println("Employee Name: " +e1.name + "\nEmployee ID: " +e1.id);
		Employee e2 = new Employee();
		e2.name="DEF";
		e2.id =2;
		System.out.println("Employee Name: " +e2.name + "\nEmployee ID: " +e2.id);
		Employee e3 = new Employee();
		System.out.println("Employee Name: " +e3.name + "\nEmployee ID: " +e3.id);
		e3.name="GHI";
		e3.id =3;
		System.out.println("Employee Name: " +e3.name + "\nEmployee ID: " +e3.id);
	}

}
