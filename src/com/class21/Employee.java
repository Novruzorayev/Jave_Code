package com.class21;

public class Employee {
	public static String CEO = "Sumair";
	int eID;
	int salary;
	
	public static void main(String[] args) {
		 /*Create a Class called Employee:
        Create three  variables  eID , salary and set the CEO to “Sumair”
        Create two objects of the class Employee
        Set the value of eID, salary for each of the objects
        Print out the eID , salary and  CEO for each of the objects
        */
    
		Employee emp1 = new Employee();
		emp1.eID = 435;
		emp1.salary = 2500;
		emp1.getEmpInfo();
		
		Employee emp2 = new Employee();
		emp2.eID = 231;
		emp2.salary = 4500;
		emp2.getEmpInfo();
		
	}

	private void getEmpInfo() {
		// TODO Auto-generated method stub
		System.out.println("The employee ID is "+eID+", the salary of the employee "+salary+" and Ceo is "+CEO+".");
		
		
	}

}
