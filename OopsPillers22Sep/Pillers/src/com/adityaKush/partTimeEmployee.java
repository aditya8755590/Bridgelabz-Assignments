package com.adityaKush;

public class partTimeEmployee extends Employee {
	private int hours;

	public partTimeEmployee(int employeeId, String name, int baseSalary,int hours) {
		super(employeeId, name, baseSalary);
		this.hours=hours;
	}

	@Override
	public int calculateSalary(Employee emp) {
		// TODO Auto-generated method stub
		return getBaseSalary()*hours/24;
	}

}
