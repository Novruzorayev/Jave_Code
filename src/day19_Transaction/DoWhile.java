package day19_Transaction;

public class DoWhile {
	public static void main(String[] args) {
		//print 1 to 10 do while loop
		int i =1;
		do {
			System.out.print(i);
			i++;
		}while(i <= 10);
		
		System.out.println();
		int sum = 0;
		int j = 1;
		do {
		sum = sum + j;
		j++;
		}while(j<=5);
		
		System.out.print("Sum from 1 to 5: "+sum);
		
	}

}
