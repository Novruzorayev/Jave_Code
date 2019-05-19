package com.class24;

public class DegreeTest {
	public static void main(String[] args) {
		Degree deg = new Degree();
		Undergraduate ug = new Undergraduate();
		Postgraduate pg = new Postgraduate();
				
			String getDegree1;
			getDegree1 = Degree.getDegree();
			System.out.println(getDegree1);
			
			getDegree1 = Undergraduate.getDegree();
			System.out.println(getDegree1);
			
			getDegree1 = Postgraduate.getDegree();
			System.out.println(getDegree1);
	}

}
