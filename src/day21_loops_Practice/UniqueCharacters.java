package day21_loops_Practice;

public class UniqueCharacters {
	public static void main(String[] args) {
		String word = "javva";
		String unique = "";
	char ch = word.charAt(0);
	System.out.println(unique.contains(""+ch));
	if(!unique.contains(""+ch)) {
		unique+=ch; //unique= unique + ch;
	}
	System.out.println("Unique:"+unique);
	}

}


