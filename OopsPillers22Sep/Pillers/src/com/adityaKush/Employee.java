package com.adityaKush;

public abstract class Employee implements Department {
	private int employeeId;
	private String name;
	private int baseSalary;
	 private String department;
	
	public Employee(int employeeId, String name, int baseSalary) {
		this.employeeId = employeeId;
		this.name = name;
		this.setBaseSalary(baseSalary);
	}


	public abstract int  calculateSalary(Employee emp);
	public void displayDetails() {
		System.out.println(toString());
	}
	
	 @Override
	    public String toString() {
	        return "Employee ID" + employeeId +"Name" + name +"Base Salary" + getBaseSalary();
	    }


	 public int getBaseSalary() {
		return baseSalary;
	 }


	 public void setBaseSalary(int baseSalary) {
		this.baseSalary = baseSalary;
	 }
	 
	 @Override
	    public void assignDepartment(String deptName) {
	        this.department = deptName;
	    }



}
