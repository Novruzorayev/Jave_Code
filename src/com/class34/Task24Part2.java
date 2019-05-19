package com.class34;

import java.util.HashMap;
import java.util.Map;

public class Task24Part2 {
	public static void main(String[] args) {
		/*
		 * 2. Write a program to check which employee gets highest salary use hashmap employee name as key and salary amount as the value. 
              Output example: John Smith=100000.
		 */
		Map<String, Integer> salaryMap = new HashMap<>();
		salaryMap.put("John", 70000);
		salaryMap.put("Jamesn", 80000);
		salaryMap.put("Frank", 90000);
		salaryMap.put("David", 50000);
		salaryMap.put("Jordan", 100000);
		
		int maxSalary = 0;
		String key = null;
		for(Map.Entry<String, Integer> entry: salaryMap.entrySet()) {
			if(entry.getValue()>maxSalary){
				maxSalary = entry.getValue();
				key = entry.getKey();
			}
		}
		System.out.println(maxSalary+" belongs to "+key);
	}

}
