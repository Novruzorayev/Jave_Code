package day18_while_dowhile_loops;

public class StairCase {
	public static void main(String[] args) {
		/*
		 * 
		 **
		 ***
		 ****           this is a task
		 *****
		 ******
		 *******
		 */
		String stairs = "*";
	    //1) with a counter
		int num = 1;
		while(num<=10) {
			System.out.println(stairs);
		stairs+="*";
		num++;
	}
	//2) checking lenght()
		stairs ="*";
		while(stairs.length()<=10) {
			System.out.println(stairs);
			stairs+="*";
		}
	
	}

}
