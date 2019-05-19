package com.class28;

public interface Bank {
//	by default compiler adds public and abstract to every mrthod
	void hasChecking();

	void hasSavings();

	void hasCreditCard();
//	static void hasLoan(); cannot  have static abstract
}

class BOA implements Bank {

	@Override
	public void hasChecking() {
		System.out.println("BOA has 2 checking accounts");

	}

	@Override
	public void hasSavings() {
		System.out.println("BOA has 2 savings accounts");

	}

	@Override
	public void hasCreditCard() {
		System.out.println("BOA has 10 different Creit Cards");

	}

}

class PNC implements Bank {

	@Override
	public void hasChecking() {
		System.out.println("BOA has 3 checking accounts");

	}

	@Override
	public void hasSavings() {
		System.out.println("BOA has 4 checking accounts");

	}

	@Override
	public void hasCreditCard() {
		System.out.println("BOA has 8 different Creit Cards");
	}
}