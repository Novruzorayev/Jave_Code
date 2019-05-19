package com.class21;

public class Student {
	public String studentName;
	public static int numberOfStudents;
	public static int StudentID;

	public static void main(String[] args) {
//		Create a Class called Students
//		Create three  variables  studentName , studentID  and  numberOfStudents
//		Create three objects of the Students Class
//		Set the value for  studentName , studentID and increment  the numberOfStudents for each object
//		Print out  total number of students

		Student obj1 = new Student();
		obj1.studentName = "Mary";
		obj1.StudentID = 9;
		numberOfStudents++;

		Student obj2 = new Student();
		obj2.studentName = "Jack";
		obj2.StudentID = 4;
		numberOfStudents++;

		Student obj3 = new Student();
		obj3.studentName = "Bob";
		obj3.StudentID = 11;
		numberOfStudents++;

		System.out.println("The total number of the students: " + numberOfStudents);

	}

}
