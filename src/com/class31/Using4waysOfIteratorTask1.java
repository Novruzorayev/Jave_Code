package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Using4waysOfIteratorTask1 {
	public static void main(String[] args) {
/*
 * 1.Create an arraylist of cars and retrieve all the values using 4 different ways.		
 */
		ArrayList<Integer> cars = new ArrayList<>();
		cars.add(1);
		cars.add(2);
		cars.add(3);
		System.out.println("===1st way===");
		for(int i = 0; i<cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		System.out.println("===2nd way===");
		Iterator<Integer> a= cars.iterator();
		while(a.hasNext()) {
			System.out.println(a.next());
		}
		System.out.println("===3rd way===");
		int b = 0;
		while(cars.size()>b) {
			int myCars = cars.get(b);
			System.out.println(myCars);
			b++;
		}
		System.out.println("===4th way===");
		for(Integer car: cars) {
			System.out.println(car);
		}
	}

}
