package com.class23;

public class ConstructorOverloading {
	ConstructorOverloading(){
		System.out.println("I am a constructor without parameters");
	}
	 ConstructorOverloading(String str){
		 System.out.println("I am a constructor with 1 String parameters");
	 }
	 ConstructorOverloading(String str, String str1){
		 System.out.println("I am a constructor with 2 String parameters");
	 }
	 ConstructorOverloading(int a){
		 System.out.println("I am a constructor with 1 Int parameters");
	 }

}
