package day05_math_operators;

public class ArithmeticOperators {
	public static void main(String[] args) {
		System.out.println(55+5);
		int chairs = 140;
		System.out.println(chairs +2);
		int moreChairs = chairs + 5;
		System.out.println(moreChairs);
		int tables = 130;
		int total = tables + chairs;
		System.out.println(total);
		
		double balance = 1200.50;
		double transaction = 56.44;
		balance = balance - transaction;
		System.out.println(balance - transaction);
		System.out.println(balance);
		
		int linesOfCode = 50;
		System.out.println("Lines of code "+linesOfCode);
		linesOfCode = linesOfCode - 2;
		System.out.println("lines of code "+linesOfCode);
		
		int classes = 5;
		System.out.println(linesOfCode * classes);
		
		int totalLinesOfCode = linesOfCode * classes;
		System.out.println("Total lines of code = "+totalLinesOfCode);
		
		System.out.println(10/ 3);
		System.out.println(15/ 7);
		
				
		
	}

}
