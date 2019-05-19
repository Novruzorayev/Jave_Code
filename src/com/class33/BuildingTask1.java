package com.class33;

import java.util.HashMap;
import java.util.Map;

public class BuildingTask1 {
	public static void main(String[] args) {
		// Create a map of building. Store floor number and it is associated company name. 
		//(Example: 1 = Google, 2= Syntax, etc). Insert 7 entries with duplicate keys and values.
		Map<Integer, String> building = new HashMap<>();
		building.put(1, "Google");
		building.put(2, "Syntax");
		building.put(3, "Amazon");
		building.put(4, "Apple");
		building.put(5, "Samsung");
		building.put(6, "Nokia");
		building.put(7, "PNC");

		System.out.println(building);
		System.out.println(building.size());
		building.replace(4, "LG");
		System.out.println(building.get(4));
		building.remove(7);
		System.out.println(building.size());
		System.out.println(building);
		





	}

}
