package com.class26;

public class SuperKeyword {
	String name = "John";
	public void sayName() {
		System.out.println("My name is "+name);
	}

}
class ChildSuperKeyword extends SuperKeyword {
	String name = "Michael";
	public void sayName() {
		System.out.println("My name is "+super.name);
		System.out.println("My name is "+name);
	}
	public void callingMethods() {
		sayName();
		super.sayName();
	}
	
}
