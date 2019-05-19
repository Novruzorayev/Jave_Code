package com.class31;

import java.util.ArrayList;


public class ReplaceTask3 {
	public static void main(String[] args) {
		/*
		 * 3.Create an arrayList of drinks. If any drink has letter “a” or “e” replace
		 * it with water.
		 * 
		 */
		ArrayList<String> drinks = new ArrayList<String>();;
		drinks.add("lemonade");
		drinks.add("milk");
		drinks.add("fanta");

		for(int i = 0; i<drinks.size(); i++){
			String drink = drinks.get(i);
			if (drink.contains("e") || drink.contains("a")) {
				drinks.set(i,"water");
			}
		}
		System.out.println(drinks);
	}

}
