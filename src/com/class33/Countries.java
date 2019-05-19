package com.class33;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Countries {
	/*
	 * Create a map of countries with its capital. 
       Print all keys and values from a country map using for each loop and iterator.
       Print all values from a country map using for each loop and iterator.
	 */
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Ashgabat");
		map.put(2, "Istanbul");
		map.put(3, "New York");
		map.put(4, "London");
		map.put(5, "Moscov");
		map.put(6, "Kiew");
	System.out.println(map);
	
	Set<Integer> keys = map.keySet();
	for(Integer key: keys) {
		System.out.print(key+", ");
		
	}
	System.out.println();
	Collection<String> value= map.values();
	for(String val: value) {
		System.out.print(val+", ");
	}
	System.out.println();
	Iterator<Integer> it = keys.iterator();
	while(it.hasNext()) {
		System.out.print(it.next()+", ");
	}
	System.out.println();
	Iterator<String> itval= value.iterator();
	while(itval.hasNext()) {
		System.out.print(itval.next()+", ");
	}

	}

}
