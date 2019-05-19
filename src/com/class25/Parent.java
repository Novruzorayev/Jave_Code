package com.class25;

public class Parent {
	Parent(){
		System.out.println("I am a parent constructor");
	}

}
class child extends Parent{
	Parent(){
		System.out.println("I am a child constructor");
	}
}
