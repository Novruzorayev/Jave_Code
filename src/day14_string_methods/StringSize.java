package day14_string_methods;

public class StringSize {
	public static void main(String[] args) {
		String str1 ="Good Morning";
		if(str1.equals("Good Morning")) {
			System.out.println("Match");
		}else {
			System.out.println("Not Match");}
		if(str1.equalsIgnoreCase("good morning")) {
			System.out.println("Match - ignore case");
		}else {
			System.out.println("Not Match - ignore case");
		}
		System.out.println(str1.toUpperCase());	
		System.out.println(str1);
		str1 = str1.toUpperCase();
		System.out.println("After assignment: "+str1);
		
		
		String myName = "Novruz";
		System.out.println(myName.length());
		
		
		System.out.println(myName.length());
		int length= myName.length();
		System.out.println("My name's length: "+length);
		
		
		String userName = "password";
		if(userName.length()==8) {
			System.out.println("Valid username");
		}else {
			System.out.println("Invalid username, must be at least 8 chars");
		}
		String password = "WoodenSpoon";
		if(password.length()>= 6) {
			System.out.println("Password is good");
		}else {
			System.out.println("Password is to short"); 
		}
	}

}
