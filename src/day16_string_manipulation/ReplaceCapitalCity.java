package day16_string_manipulation;

public class ReplaceCapitalCity {
	public static void main(String[] args) {
		String str = "Moscow is a capital of Russia";
		str=str.replace("Moscow","Baku").replace("Russia", "Azarbaijan");
		System.out.println(str);
		
		String email = "firstName_LastName@gmail.com";
		String company= "deloitte";
		String newEmail = email.replace("gmail", company);
		System.out.println(newEmail);
	}

}
