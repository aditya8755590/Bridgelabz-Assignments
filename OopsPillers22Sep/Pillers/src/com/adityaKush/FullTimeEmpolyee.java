package com.adityaKush;

public class FullTimeEmpolyee extends Employee {
	int exprience;

	public FullTimeEmpolyee(int employeeId, String name, int baseSalary,int years) {
		super(employeeId, name, baseSalary);
		exprience=years;
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calculateSalary(Employee emp) {
		
		return exprience*getBaseSalary()+1000;
	}

	@Override
	public void assignDepartment() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getDepartmentDetails() {
		// TODO Auto-generated method stub
		
	}
	

}
