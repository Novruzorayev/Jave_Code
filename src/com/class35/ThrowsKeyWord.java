package com.class35;

public class ThrowsKeyWord {
	public static String name = "Novruz";
	public static void main(String[] args) {
		sleepMode();
	}
	public static void studentSleeping() throws InterruptedException {
		System.out.println("Student "+name+" is sleeping");
		Thread.sleep(3000);
		System.out.println("Give some coffee..");
	}
public static void allStudentsSleeping() throws InterruptedException{
	studentSleeping();
}
public static void sleepMode() {
	try {
		allStudentsSleeping();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}