package day22_loops_practice2;

public class SubstringPractice {
	public static void main(String[] args) {
		String word = "java";
		//word = word.substring(0,1)+" "+word.substring(1,2)+" "+word.substring(2,3)+" "+word.substring(3,4);
		//System.out.println(word);
		System.out.print(word.substring(0,1));
		System.out.print(word.substring(1,2));
		System.out.print(word.substring(2,3));
		System.out.println(word.substring(3,4));
		
		
		
		int i = 0;
		System.out.print(word.substring(i ,i+1));
		i++;
		System.out.print(word.substring(i ,i+1));
		i++;
		System.out.print(word.substring(i ,i+1));
		i++;
		System.out.println(word.substring(i ,i+1));
		
		
		//for (int n = 0; n <= 3; n++) {
			//System.out.print(word.substring(n, n+1));
		
		for(int n = 3; n >= 0; n--) {
			String letter = word.substring(n,n+1);
			System.out.print(letter);
		}	
			
		}
	}


