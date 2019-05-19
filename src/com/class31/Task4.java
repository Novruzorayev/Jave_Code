package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Task4 {
	public static void main(String[] args) {
		/*
		 * 4.Create an arrayList of even numbers from 1 to 50. Using Iterator remove any
		 * number that is divisible by 5 from that arrayList. //
		 */
		ArrayList<Integer> numbers = new ArrayList<>();
		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				numbers.add(i);
			}
		}
		System.out.println(numbers);
		Iterator<Integer> it = numbers.iterator();
		while (it.hasNext()) {
			int number = it.next();
			if (number % 5 == 0) {
				it.remove();
			}
		}
		System.out.println(numbers);
	}

}
