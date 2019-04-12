package day15_String_Manipulation;

public class Contains {
	public static void main(String[] args) {
		String email = "test@gmail.com";
		System.out.println(email.contains("@"));
		
		String list = "potatoes, apples tomatoes, eggs, milk, bread, cereal, meat";
		if(list.contains("apples")) {
			System.out.println("Apples are there!");
		}else {
			System.out.println("Lets Add apples now");
			
		}	
			boolean hasEggs = list.contains("eggs");
			System.out.println("Contains eggs: "+ hasEggs);
			boolean cucumbers = list.contains("cucumbers");
			System.out.println("Contains cucumber: "+cucumbers);
		

		String name = "Novruz";
		if(name.contains("a") || name.contains("e")){
			System.out.println("'a' or 'e' is present");
		}else {
			System.out.println("'a' or 'e' is not present");
		}
			
		
	}

}
