package com.class22;

public class StaticNonStatic {
	public String name = "John";// intance variable
	
	public static String lastName="Snow";//static variable
	
	public static void main(String[] args) {
		StaticNonStatic obj = new StaticNonStatic();
		obj.getInfo();
		
		getInfo1();// within same class we can call it by using method/variable name
		System.out.println(lastName);
		System.out.println(obj.name);
		
	}
//	non static method -- can access both instance and static variables
	public void getInfo() {
		System.out.println("My name is "+name+" and my last name is "+lastName);
		getInfo1();
		//System.out.println(name); we can access static methods within non static
	}
	//static method can have an access only to static variables
	public static void getInfo1() {
		//System.out.println("My name is "+name+" and my last name is "+lastName);
		//name will get an error
		System.out.println("I am a static method");
//		getInfo(); we cannot access non static method within static
	}
	

}
