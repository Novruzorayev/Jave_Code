package com.class21;
import syntaxDay01.AccessModifiers;
public class TestAccessModifiers {
	public static void main(String[] args) {
		AccessModifiers obj = new AccessModifiers();
		obj.isPalindrome("madam"); //accessing public method
		obj.reverseString("hello");//accessing protected method
		obj.sayHello();//accessing protected method
		
       System.out.println(obj.name3);//accessing public variable in different package
	}

}
