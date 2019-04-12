package day24;

public class CheckFirstAndLastValue {
	public static void main(String[] args) {
		//write a program that will print true
		//if first and last number is the same
		//if first and last value in the array of ints
		//in same, print true
		int[] numbers = {2,41,213,21,42,2};
		boolean equals = numbers[0] == numbers[numbers.length-1];
		System.out.println(equals);
	}

}
