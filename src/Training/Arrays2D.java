package Training;

public class Arrays2D {
	public static void main(String[] args) {
		int[][] arr = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11},
				{1,2,3,4},
		};
		int largest  = arr[0][0];
		int smallest = arr[0][0];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j]>largest) {
					largest = arr[i][j];
				}else if(arr[i][j]< smallest) {
					smallest = arr[i][j];
			}
		}
			
		
	}
		System.out.println("Largest: "+largest);
		System.out.println("Smallest: "+smallest);

	}
}
