package com.class26;

public class BankTest {
	public static void main(String[] args) {
		
		Bank obj1 = new BankA();
		System.out.println(obj1.getBalance());
		
		Bank obj2= new BankB();
		System.out.println(obj2.getBalance());
		
		Bank obj3 = new BankC();
		System.out.println(obj3.getBalance());
	}

}
