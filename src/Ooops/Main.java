package Ooops;

public class Main {
	public static void main(String[] args) {
		Vehicle veh1 = new Vehicle("VolksWagen", "Black", "CC Passat", 2013);
		System.out.println(veh1.color);
		Vehicle veh2 = new Vehicle("VolksWagen", "Black", "CC Passat", 2013);
		System.out.print(veh2.name+" ");
		System.out.print(veh2.color+" ");
		System.out.print(veh2.make+" ");
		System.out.println(veh2.year);

		
	}

}
