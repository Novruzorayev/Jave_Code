package com.class32;

public class InsuranceTask1 {
	/*
	 * Create a class Insurance that will have an attribute as insuranceName and unimplemented behavior as getQuote and cancelInsurance. 
	 * Create 3 subclasses Car, Pet, Health.
	 *  Car class has it’s own attribute as carModel and Class Pet has petType attribute.
	 */
public String petType;

void getQuote(){
	System.out.println("get quote for pet");
}
void cancelInsurance() {
	System.out.println("cancel insurance for nothing");
}
}
class Health extends InsuranceTask1{
	void getQuote() {
		System.out.println("get quote for health insurance");
	}
	void cancelInsurance() {
		System.out.println("cancel insurance for health");
	}
}