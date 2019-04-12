package day08_casting_conditionals;

public class CastingPrimitives {
	public static void main(String[] args) {
		//cast double value to int
		int i = (int) 3.4;
		System.out.println("i : " +i);
		
		double price = 230.50;
		int dollars = (int) price;
		
		System.out.println("Price: " +price);
		System.out.println("Dollars: " +dollars);
		//WHOLENUMBERS. byte, short, int.
		
		int count = 120;
		byte byteCount = (byte) count;
		System.out.println("ByteCount: " + byteCount);
		
		
		
		
		
	}

}
