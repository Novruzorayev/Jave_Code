package day23_Arrays_and_Loops;

public class Loops3Reverse {
	public static void main(String[] args) {
		for(int i = 10; i>=1; i-- ) {
			for(int j = i; j>=1; j--)
				System.out.print(i+" ");
		}
		System.out.println();
	}

}
