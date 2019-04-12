package day14_string_methods;

public class CharAt {
	public static void main(String[] args) {
		String word = "Comp uter";
		//print first characters one by one 
		System.out.println(word.charAt(0));
		System.out.println(word.charAt(1));
		System.out.println(word.charAt(2));
		System.out.println(word.charAt(3));
		System.out.println(word.charAt(4));
		System.out.println(word.charAt(5));
		System.out.println(word.charAt(6));
		System.out.println(word.charAt(7));
		
		
		String word3 = "civic";
		char first = word3.charAt(0);
		char last = word3.charAt(4);
		if(first==last) {
			System.out.println("First and last match");
		}else {
			System.out.println("Do not match");}		
		
	String word4 = "Automation";
	char lastChar = word4.charAt(word4.length()-2);
	System.out.println("Last char of "+word4+ " is "+lastChar);
		
		
		
	}

}
