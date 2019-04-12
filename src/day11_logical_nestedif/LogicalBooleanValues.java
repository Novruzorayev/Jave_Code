package day11_logical_nestedif;

public class LogicalBooleanValues {
	public static void main(String[] args) {
		boolean b1 = 50 > 10 && 10 > 100;
		System.out.println("B1: "+b1);
		
		boolean b2 = 'a' == 'a' && 123 > 120;
		System.out.println("B2: "+b2);
		
		boolean b10 = !true || true && false;
		System.out.println("B10:"+b10);
	}

}
