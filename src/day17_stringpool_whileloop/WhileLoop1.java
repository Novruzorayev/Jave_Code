package day17_stringpool_whileloop;

public class WhileLoop1 {
	public static void main(String[] args) {
		int n1 = 100;
		int n2 = 140;
		while(n2 > n1) {
			System.out.println("n2 is greater");
		}
		System.out.println("End");
		// the above loop is infinite loop
		// the condition(n2> n1) will always be true, never be false
	}

}
