package day19_Transaction;

public class PrintLetters {
	public static void main(String[] args) {
		String word = "CybertekSchool";
		// PRINT EACH CHARACTER ONE BY ONE IN SEPARATE LINES
		int idx = 0;
		while (idx < word.length()) {
			System.out.print(word.charAt(idx));
			idx++;}
		System.out.println();
			int idx2 = word.length()-1;
			while(idx2 >= 0) {
				System.out.print(word.charAt(idx2));
				idx2--;
			
			
		}
		
	}
}
