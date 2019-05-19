package com.class28;

public abstract class Vehicle {
	public abstract void start();
	public abstract void drive();
	public void stop() {
		System.out.println("Stop vehicle by pressing break");
	}
	abstract class Car extends Vehicle{
		
	}
	class BMW extends Car{
		@Override
		public void start() {
        System.out.println("BMW car starts emote");
			
		}
		@Override
		public void drive() {
		System.out.println("BMW car drives fast");
		}

		
	}

}
