package com.kushAditya;

public class RegularCostumer extends Costumer {

	public RegularCostumer(int costumerId, String name, String email) {
		super(costumerId, name, email);
		// TODO Auto-generated constructor stub
	}
	@Override
     public Double  ShowBill() {
		
		return Bill*(98/100);
		
	}
	

}
