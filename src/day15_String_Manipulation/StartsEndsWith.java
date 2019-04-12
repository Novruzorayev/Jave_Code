package day15_String_Manipulation;

public class StartsEndsWith {
	public static void main(String[] args) {
		String word1 = "eclipse";  //startsWith==> tests if string starts with another
		System.out.println(word1.startsWith("e")); //true
		System.out.println(word1.startsWith("ec")); //true
		System.out.println(word1.startsWith("Ec")); //false cuz of uppercase E
		System.out.println(word1.endsWith("e")); // true
		System.out.println(word1.endsWith("ipse")); //true
		System.out.println(word1.endsWith("java")); //false
		
		System.out.println(word1.toUpperCase().endsWith("PSE")); //TRUE CUZ OF UPPERCASE
		
		String name = "Dm. Jackson";
		if(name.startsWith("Mr")) {
			System.out.println("man");
		}else if(name.startsWith("Ms")) {
			System.out.println("married woman");
		}else if(name.startsWith("Ms")) {
			System.out.println("Some woman");
		}else if(name.startsWith("Dr")) {
			System.out.println("Doctor man  or woman"); 
		}else {
			System.out.println("Uknown status");
		}
	}

}
