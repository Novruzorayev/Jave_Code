package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveTask2 {
	public static void main(String[] args) {
//	2.Create an arrayList of words. Remove every word that ends with “e”.

		ArrayList<String> words = new ArrayList<String>();
		words.add("orange");
		words.add("pineapple");
		words.add("banana");
		words.add("strawbeerry");
		words.add("melon");

		Iterator<String> iterator = words.iterator();
		while (iterator.hasNext()) {
			String letter = iterator.next();
			if (letter.endsWith("e")) {
				iterator.remove();
			}
		}
		System.out.println(words);
	}
}