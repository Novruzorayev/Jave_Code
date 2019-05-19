package com.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class GetValueFromArrayList {
	public static void main(String[] args) {
		ArrayList <String> names = new ArrayList<String>();
		names.add("Novruz");
		names.add("Batyr");
		names.add("Mekan");
		names.add("Novruz");
		
		//1st way using for loop
		for(int i = 0; i <names.size(); i++) {
			System.out.println(names.get(i));
		}
		System.out.println();
		//2nd way using advance foor loop
		for(Object name: names) {
			System.out.println(name);
		}
		System.out.println();
		//3rd way using iTERATOR
		Iterator<String> it = names.iterator();
//		boolean check = it.hasNext();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
