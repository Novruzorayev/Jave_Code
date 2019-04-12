package day18_while_dowhile_loops;

public class Loops3 {
	public static void main(String[] args) throws InterruptedException {
		//1, 2, 3, .....
		int num = 1;
		
		while(num<= 10) {
			System.out.print(num+ ", ");
			num++;
		}
	System.out.println("\nNum of value after loop: " +num);
	
	//11,10, 9, 8, .....
	int num2 = 11;
	while(num2 >= 1) {
		System.out.print(num2+", ");
		num2--;
		Thread.sleep(456); // <=== this is pause the loop and it goes very slowly.
	}
	    System.out.println("\nNum2: "+num2);
	}
}
