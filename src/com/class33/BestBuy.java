package com.class33;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class BestBuy {
	public static void main(String[] args) {
		/*
		 * Create a map of Best Buy store. Place
           item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
           Print all keys and values from a Best Buy map using EntrySet.
		 */
		Map<Integer, String> store = new LinkedHashMap<>();
		store.put(766487, "Printer");
		store.put(12347, "TV");
		store.put(654321, "CellPhone");
		
		System.out.println(store);
		for(Map.Entry<Integer, String> entry: store.entrySet()) {
			System.out.println(entry.getKey()+"= "+entry.getValue());
			
		}
		System.out.println();
		Iterator<Map.Entry<Integer, String>> storesit = store.entrySet().iterator();
		while(storesit.hasNext()) {
			Map.Entry<Integer, String> entry = storesit.next();
			System.out.println(entry.getKey()+"= "+entry.getValue());
		}
	}

}
