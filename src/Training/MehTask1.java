package Training;
import java.util.*;
public class MehTask1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your number:");
		int num = scan.nextInt();
		if(num>0) {
			System.out.println(num+" is positive");
		}else if(num<0) {
			System.out.println(num+" is negative");
		}else if(num==0){
			System.out.println();
		}
		
	}
	

}
