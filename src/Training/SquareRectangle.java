package Training;
import java.util.*;
public class SquareRectangle {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int length,width;
		String shape = "";
		System.out.println("Please enter your length");
		length = scan.nextInt();
		System.out.println("Please enter your width");
		width = scan.nextInt();
		if(length > width) {
			System.out.println("Your shape is rectangle");
		}else if(length==width) {
			System.out.println("Your shape is square");
		}else {
			System.out.println("Invalid shape");
		}
	}

}
