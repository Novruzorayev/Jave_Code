package Training;

import java.util.*;

public class Odev_044 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int house = scan.nextInt();
		int player = scan.nextInt();
		int cardTotal = 21 ;
		
	
		
		if(cardTotal<player) {
			System.out.println("bust");
	        }else if(house>player) {
			System.out.println("player loss");
			}else if(player == house) {
				System.out.println("its a tie");
			}else if(player > house) {
				System.out.println("player wins");
			
			
		
	}
}
}
