package com.class24;

public class Bank {
	//Parent Class
	public int chargeInterest() {
		return 0;
	}
}
// 1. Child Class
class BOA extends Bank{
	public int chargeInterest() {
		return 2;
    }
}
// 2 Child Class
class PNC extends Bank{
	public int chargeInterest() {
		return 3;
	}
}
