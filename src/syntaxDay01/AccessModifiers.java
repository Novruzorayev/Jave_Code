package syntaxDay01;

public class AccessModifiers {
	private String name = "John";
	String name1 ="Bilal";
	protected String name2= "Asha";
	public String name3 = "Tetiana";
	
	public static void main(String[] args) {
		AccessModifiers obj = new AccessModifiers();
		String reversed = obj.reverseString("Hello");
		System.out.println(reversed);
		
		System.out.println(obj.isPalindrome("hey"));
	}
	
		/*
		 * Create a method that will take 1 parameter as a String
		 * and return reversed String
		 * Method should be visibly only within same package
		 */
		public String reverseString(String str) {
			String reversed ="";
			for (int i =str.length()-1; i>=0; i-- ) {
				reversed = reversed+str.charAt(i);
			}
			return reversed;
		}
		/*
		 * Create a method that will take a String and
		 * return weather String is palindrome or not
		 * Method should be available to all access within your projects
		 */
		public boolean isPalindrome(String str) {
			String reversed ="";
			boolean flag = false;
			for (int i =str.length()-1; i>=0; i-- ) {
				reversed = reversed+str.charAt(i);
		}
			if(reversed.equalsIgnoreCase(str)) {
				flag = true;
			}
			return flag;
	}

		public void sayHello() {
			// TODO Auto-generated method stub
			
		}
}

