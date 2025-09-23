package com.kushAditya;

public class Costumer {
	public int costumerId;
	String name;
	String Email;
	Double Bill=0.0;
	
	public Costumer(int costumerId, String name, String email) {
		this.costumerId = costumerId;
		this.name = name;
		Email = email;
	}
	public Double  ShowBill() {
		
		return Bill;
		
	}
	

}
