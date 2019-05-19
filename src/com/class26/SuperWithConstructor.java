package com.class26;

public class SuperWithConstructor {
	public SuperWithConstructor() {
		System.out.println("I am a parent class consructor");
	}

}
class ChildOfSuperWithConstructor extends SuperWithConstructor{
	public ChildOfSuperWithConstructor() {
		System.out.println("I am a child class constructor");
	}
}
