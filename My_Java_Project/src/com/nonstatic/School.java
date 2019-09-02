//Sample program to create a class of students- school with namer and marks.
package com.nonstatic;

public class School {

	public static void main(String[] args) {
		Students s1 =new Students();
		Students s2 =new Students();
		System.out.println("Student Name: " + s1.Name + "\nStudent marks: " +s1.marks);
		System.out.println("Student Name: " + s2.Name + "\nStudent marks: " +s2.marks);
		s1.Name = "ABC";
		s2.Name ="DEF";
		s1.marks =99;
		s2.marks = 100;
		System.out.println("Student Name: " + s1.Name + "\nStudent marks: " +s1.marks);
		System.out.println("Student Name: " + s2.Name + "\nStudent marks: " +s2.marks);
	}

}
