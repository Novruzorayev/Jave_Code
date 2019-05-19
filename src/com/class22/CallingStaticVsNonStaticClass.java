package com.class22;

public class CallingStaticVsNonStaticClass {
	public static void main(String[] args) {
		
	StaticNonStatic obj = new StaticNonStatic();
	//accessing Non Static members
	System.out.println(obj.name);
	obj.getInfo();
	// access static members by using className they belong to
	System.out.println(StaticNonStatic.lastName);
	StaticNonStatic.getInfo1();
	
	}
}
