package Training;
import java.util.*;
public class XY {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x,y;
		System.out.println("Please enter first number");
		x = scan.nextInt();
		System.out.println("Please enter second number");
		y = scan.nextInt();
		if(x*y > 0 ) {
			System.out.println(true);
		}else if (x*y < 0)
			System.out.println(false);
		
		}
	}


