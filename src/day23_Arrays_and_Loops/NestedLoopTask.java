package day23_Arrays_and_Loops;

public class NestedLoopTask {
	public static void main(String[] args) {
		//outer loop will repeat printing of letter as many times as you want
		// in this case we are gonna print 3 times
		//so we are repeating inner loop 3 times
		for (int i = 0; i < 5; i++) {
		for (char letter = 'a'; letter <= 'z'; letter++) {
			// write a for loop that will print letter from a
			System.out.print(letter + ", ");
		}
		System.out.println();
		System.out.println("*****************************************************************************");
	}
	}
}
