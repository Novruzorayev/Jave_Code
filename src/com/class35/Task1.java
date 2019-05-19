package com.class35;
import java.util.*;
import java.util.InputMismatchException;

public class Task1 {
	public static void main(String[] args) {
		//how would handle InputMismatchException? Input MisMatch Exception when user enters mismatch value the programmer expected
	Scanner input = new Scanner(System.in);
	System.out.println("enter your age");
		try {
		int age = input.nextInt();
		System.out.println("your age is "+age);
	} catch (InputMismatchException e) {
		System.out.println("your input is integer");
	}
	System.out.println("end of code");
}
}