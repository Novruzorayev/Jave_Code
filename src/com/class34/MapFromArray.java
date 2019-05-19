package com.class34;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;



public class MapFromArray {
	public static void main(String[] args) {
		String[] names = {"Mehmet", "Asha", "Amina","Omar","Siyar"};
		Map<Integer, String> namesMap = new LinkedHashMap<>();
		int key = 1;
		for(String name: names) {
			namesMap.put(key, name);
			key++;
			
		}
		System.out.println(namesMap);
		// print key and values using entrySet(loop and Iteartor)
		for(Entry<Integer, String> entry: namesMap.entrySet()) {
			String mapValue = entry.getKey()+" == "+entry.getValue();
			System.out.println(mapValue);
		
	}
		System.out.println();
		Iterator<Entry<Integer, String>> it = namesMap.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry entry = it.next();
			String valueFromMap = entry.getKey()+" == "+entry.getValue();
			System.out.println(valueFromMap);
	}
}
}
