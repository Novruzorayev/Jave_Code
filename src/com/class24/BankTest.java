package com.class24;

public class BankTest {
	public static void main(String[] args) {
         Bank bank = new Bank();
         BOA boa = new BOA();
         PNC pnc = new PNC();
         
         int interstRate;
         interstRate = bank.chargeInterest();
         System.out.println("Bank charges interest = "+interstRate);
        
         interstRate = boa.chargeInterest();
         System.out.println("BOA charges interest = "+interstRate);
         
         interstRate = pnc.chargeInterest();
         System.out.println("PNC charges interest = "+interstRate);
         
        
         
	}

}
