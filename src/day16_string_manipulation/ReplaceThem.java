package day16_string_manipulation;

public class ReplaceThem {
	public static void main(String[] args) {
		String sentence = "Coding is fun, it is my hobby!!";
		String withNoSpaces = sentence.replace(" ", "");
		System.out.println(withNoSpaces);
		System.out.println(sentence);
		//replace,with!!
		sentence= sentence.replace(",", "!!!");
		System.out.println(sentence);
		
		String mixed = "$^@#j$a-vla@#$";
		mixed = mixed.replace("$^@#", "");
		System.out.println(mixed);
		mixed = mixed.replace("@#$", "");
		System.out.println(mixed);
		
		mixed = mixed.replace("$", "");
		mixed = mixed.replace("-", "");
		mixed = mixed.replace("l", "");
		//mixed = mixed.replace("$", "").replace("-", "").replace("l", ""); <=== CHAIN METHOD
		System.out.println(mixed);
		
		mixed = mixed.replace("a","");
		System.out.println(mixed);
		
		//String result = "About 115,000,000 result (0,59 seconds)";
		//using string methods(replace, substring) get number of results
		//115,000,000
		//result = result.replace("About ", "").replace("result (0,59 seconds)", "");
		//System.out.println(result);
		
		String result1 = "About 115,000,000 result (0,59 seconds)";
		result1 = result1.substring(6, result1.indexOf("r"));
		System.out.println(result1);
		
		String mixed1 = "123ja34-vla@#$";
		mixed1 = mixed1.replace("123","").replace("34-","").replace("@#$","").replace("l", "");
		System.out.println(mixed1);
	}

}
