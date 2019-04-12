package Training;
import java.util.*;
public class Odev085 {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
			String shoppingListReport = "";
			String item = "";
			String countinue = "";
			double price = 0;
			int count = 1;
			double totalProce = 0;
			
			do {
				System.out.println("Enter item1 and its price:");
				item = scan.next();
				price = scan.nextDouble();
				System.out.println("Add one more item?");
			    countinue = scan.next();
			    shoppingListReport += "Item"+count+": "+item+" Price: "+price+", ";
			    totalProce += price;
			    count++;
			}while(countinue.equals("Yes") && count <= 10); 
			System.out.println(shoppingListReport.substring(0,shoppingListReport.length()-2));	
			System.out.println("Toatal price: "+totalProce);
			
	}		
	}


