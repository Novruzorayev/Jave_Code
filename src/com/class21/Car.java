package com.class21;

public class Car {
	
	public String color;
	public static int totalCars;
	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.color = "White";
		totalCars++;
		
		Car car2 = new Car();
		car2.color = "Black";
		totalCars++;
		
		System.out.println("Total car we made is "+totalCars+".");
		
		
	}

}
