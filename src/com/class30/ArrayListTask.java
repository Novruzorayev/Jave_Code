package com.class30;

import java.util.ArrayList;

public class ArrayListTask {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Novruz");
		names.add("Batyr");
		names.add("Mekan");
		names.add("Novruz");

//		System.out.println(names.get(0));
//		System.out.println(names.get(1));
//		System.out.println(names.get(2));
//		System.out.println(names.get(3));
		
		System.out.println(names.isEmpty());
		System.out.println(names.contains("Novruz"));
		System.out.println(names.size());
		
		for(String name: names) {
			System.out.println(name);
			
		}

	}

}
