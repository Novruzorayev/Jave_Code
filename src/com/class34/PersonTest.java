package com.class34;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PersonTest {
	public static void main(String[] args) {
		Map<Integer, Person> perMap = new HashMap<>();
		perMap.put(1,new Person("Novruz","Orayev",27,15000));
		perMap.put(2,new Person("Seyda","Orayeva",24,15000));
		
		Collection<Person> perValues = perMap.values();
		for(Person per: perValues) {
			per.PersonDetails();
		}
	}

}
