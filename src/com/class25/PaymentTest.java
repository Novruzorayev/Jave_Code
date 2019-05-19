package com.class25;

public class PaymentTest {
	public static void main(String[] args) {
		Payment payment = new Payment();
		payment.makePayment();
		
		MasterCard mc = new MasterCard();
		mc.makePayment();
		
		Visa visa = new Visa();
		visa.makePayment();
		visa.annualFee();
		
		Payment pay = new MasterCard();
		//any method that exist in parent and common in child
		pay.closePayment();
		pay.makePayment();
		
		Payment pay1 = new Visa();
		pay1.closePayment();
		pay1.makePayment();
	}

}
