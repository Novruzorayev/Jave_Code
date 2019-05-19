package com.class35;

public class MultipleCatch {
	public static void main(String[] args) {
		System.out.println("beginning of the code");
		try {
			Thread.sleep(2000);
			System.out.println(10/0);
		}catch (ArithmeticException e) {
			//3 way to print name and details of an exception
//			e.printStackTrace();  //1 WAY //name of E, detail of E, location
			System.out.println(e.getMessage());  // 2ND WAY  //details of an E
//			System.out.println(e); //3rd way
			System.out.println("Code of Aritmetic Exception catch");
		}catch (InterruptedException e) {
			System.out.println("Code of Interrupted Exception catch");
		}
		System.out.println("end of the code");
	}

}
