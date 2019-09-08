//assignment 
package com.nonprimitivearray;

public class Company {
	public static void main(String[] args) {
		Employee[] employee =new Employee[5];
		employee[0] =new Employee(1, "Shekhanr",2.0);
		employee[1]=new Employee(2,"Baghira",1.2);
		employee[2]=new Employee(3,"Mowgly",3.2);
		employee[3]=new Employee(4,"Bhalu",5.2);
		employee[4]=new Employee(2,"Moti",2.5);
		for(int i=0; i<employee.length;i++)
			System.out.println(" Employee ID: "+employee[i].id+"\n Employee Name: "+employee[i].name+"\n Employee Salary: "+employee[i].salary);
	}
}