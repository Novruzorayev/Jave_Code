package com.class27;

public class Student {
	/*
	 * 1. Write program as a student class that has instance variables name and address. 
	 *    Create a constructor that will initialize those variables. 
	 *    Print name & address of given  student by the displayInfo method.
	 */
    String name, address;
   public Student(String name, String address){
    	this.name = name;
    	this.address = address;
    	
    }
    public void DisplayInfo() {
    	System.out.println("Student name is "+name+" and his address is "+address);
    }
    
}
