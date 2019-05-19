package com.class34;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapReview {
	public static void main(String[] args) {
		// create a map of grocery products and it is quantity
		Map<String, Integer> groceryMap = new LinkedHashMap<>();
		groceryMap.put("Milk", 1);
		groceryMap.put("Bread",2);
		groceryMap.put("Eggs", 12);
		groceryMap.put("Coffee", 2);
		groceryMap.put("Potato", 2);
		groceryMap.put("Cookies", 3);
		
		System.out.println(groceryMap);
		System.out.println(groceryMap.size());
		groceryMap.put("Cheese", 3);
		System.out.println(groceryMap.size());
		//replace
		groceryMap.replace("Cheese", 20);
		System.out.println(groceryMap);
		//remove
		groceryMap.remove("Coffee");
		System.out.println(groceryMap);
		//retrieve all keys+values using keyset();
		
		Set<String> keySet = groceryMap.keySet();
		for(String key: keySet) {
			System.out.println("Key is "+key+" and value is "+groceryMap.get(key));
		}
		//retrieving all key using
		Iterator<String> keyit = keySet.iterator();
		while(keyit.hasNext()) {
			String key = keyit.next();
			System.out.println(key+":"+ groceryMap.get(key));
		}
		//short way retrieving key 
		for(String key: groceryMap.keySet()) {
			System.out.println(key+":"+groceryMap.get(key));
		}
		//retrieving all values using
		Collection<Integer> valCol = groceryMap.values();
		for(Integer value: valCol) {
			System.out.println(value);
		}
		//short way retrieving all values using
		for(Integer value: groceryMap.values()) {
			System.out.println(value);
		}
		//retrieving all keys+values using entrySet();
		for(Map.Entry<String, Integer> entry: groceryMap.entrySet()) {
			String mapValue = entry.getKey()+" == "+entry.getValue();
			System.out.println(mapValue);
		}
		//Iterator method --> Map.Entry
		
		Iterator<Map.Entry<String, Integer>> it = groceryMap.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry entry = it.next();
			String valueFromMap = entry.getKey()+" and value is "+entry.getValue();
			System.out.println(valueFromMap);
		}
		
		
		
		
		
	}

}
