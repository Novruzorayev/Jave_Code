package com.class23;

public class MainMethodOverload {
	public static void main(String[] args) {
		System.out.println("I am main method string args array");
	}
	public static void main() {
		System.out.println("I am main method with no parameters");

	}
	public static void main(String args) {
		System.out.println("I am main method with 1 string parameters");

	}
	public static void main(int a) {
		System.out.println("I am main method with 1 Int parameters");
	}
}
