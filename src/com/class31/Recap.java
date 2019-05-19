package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Recap {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		int[] array = {10, 10, 20,20};
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(12); // comes from 
		numbers.add(0, 15);
		numbers.add(0, 14);
		
		System.out.println(numbers.size());
		System.out.println(numbers.get(2));
		
		numbers.set(1, 33);
		System.out.println(numbers.get(1));
		System.out.println(numbers.contains(33));
		
		// 1. way using for loop
		System.out.println("------------- using for loop---------------------");
		for(int i = 0; i<numbers.size(); i++) {
			System.out.println(numbers.get(i));
       // 2. way using advanced  iterator
			System.out.println("----------------- using advanced iterator------------");
			Iterator<Integer> it = numbers.iterator();
			while(it.hasNext()) {
				// int number = it.next();
				System.out.println(it.next());
			}
			//4, way using while loop
			int c= 0; 
			
			while(numbers.size()>c) {
				int myNum = numbers.get(c);
				System.out.println(myNum);
				c++;
			}
		}
		
		
		
	}

}
