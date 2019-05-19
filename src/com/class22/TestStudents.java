package com.class22;

public class TestStudents {
	public static void main(String[] args) {
		Students student1 = new Students("Novruz", 100, 80, 70);
		student1.getAverage();
		Students student2 = new Students("Wepa", 40, 80, 50);
		student2.getAverage();
		Students student3 = new Students("Jahan", 50, 60, 70);
		student3.getAverage();
		Students student4 = new Students("Geldi", 30, 40, 80);
		student4.getAverage();
		Students student5 = new Students("Dovlet", 50, 70, 70);
		student5.getAverage();
	}

}
