package com.class33;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
public class SetOverview {
	public static void main(String[] args) {
		Set<String> classDays = new LinkedHashSet<>();
		classDays.add("Tuesday");
		classDays.add("wednesday");
		classDays.add("Thursday");
		classDays.add("Saturday");
		classDays.add("sunday");
		
		System.out.println(classDays);
		System.out.println("---------------------------");
		for(String days: classDays) {
			System.out.println(days);
		}
		System.out.println("------------------------------");
        Iterator<String>it = classDays.iterator();
        while(it.hasNext()) {
        	System.out.println(it.next());
        }
	}

}
