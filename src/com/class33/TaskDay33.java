package com.class33;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class TaskDay33 {
	public static void main(String[] args) {
		//How can you remove all duplicates from ArrayList?
		List<String> aList = new ArrayList<String>();
		aList.add("John");
		aList.add("Jane");
		aList.add("James");
		aList.add("Jasmine");
		HashSet<String> alist = new HashSet<String>(aList);
		System.out.println(alist);
		}

	}




