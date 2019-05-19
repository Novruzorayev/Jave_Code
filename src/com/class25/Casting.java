package com.class25;

public class Casting {
	public static void main(String[] args) {
		//Implicit/Automatic/Widening -- compiler takes care of conversation
		double a = 10;
		System.out.println(a);
		
		//Explicit/Manual/Narrowing -- programmer takes care of conversation
		double b = 10.0;
		int c = (int)b;
		
		int i = 130;
		//byte by = 130; -- compiler won't allow you
		
		byte by = (byte)i;
		System.out.println(by);
		
		//UpCasting-- compiler takes care of conversation
		Payment pay = new MasterCard();
		
		//MasterCard mc = new Payment();--- compiler won't allow
		//DownCasting
		MasterCard mc = (MasterCard)new Payment();
		
		
	}

}
