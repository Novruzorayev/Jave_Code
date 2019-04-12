package day07_scanner_operators;

public class EnoughPizza {
	public static void main(String[] args) {
		//slices in pizza -> 8
		//slices per student -> 2
		
		int pizzaCount = 30;
		int studentCount = 145;
		
		boolean isEnoughPizza = pizzaCount * 8 >= studentCount * 2;
		System.out.println("Is Enough Pizza? " + isEnoughPizza);
				
		for(int i = 0; i <= 3; i++) {
			System.out.println("i = " + i);
		}
		
		
	}

}
