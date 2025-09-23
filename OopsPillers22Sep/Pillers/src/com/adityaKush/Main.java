package com.adityaKush;
import static java.lang.System.out; 
public class Main {
	public static void main(String[] args) {
		out.println("hii");
		
		 Employee emp1 = new FullTimeEmpolyee(101, "Aditya", 40000, 10);
	        emp1.assignDepartment("IT");

	        Employee emp2 = new partTimeEmployee(102, "Kush", 20000, 20);
	        emp2.assignDepartment("HR");

		
	}

}
