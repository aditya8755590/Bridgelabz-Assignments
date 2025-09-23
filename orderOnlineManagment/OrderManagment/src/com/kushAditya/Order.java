package com.kushAditya;

public class Order {
	Costumer customer;
	int ProductId;
	int quantity;
	int discount=0;
	
	public Order(Costumer customer, int productID, int quantity) {
		this.customer = customer;
		this.ProductId = productID;
		this.quantity = quantity;
		addOrder(this);
		showInlineOrder(this);
		
	}
	public Order(RegularCostumer customer, int productID, int quantity) {
		this.customer = customer;
		this.ProductId = productID;
		this.quantity = quantity;
		addOrder(this);
		showInlineOrder(this);
		
		
	}
	public void addOrder(Order o) { 
		Restraunent.orderList.add(o);
		Restraunent.OrderFood(o.ProductId,o.customer,o.quantity);
	}
	
	
	//show Order
	static void showInlineOrder(Order o){
		System.out.println(o.toString());
	}
	
	@Override
	public String toString(){
		return customer.name+" order  "+quantity+" "+Restraunent.getName(ProductId)+" "+"total price is "+Restraunent.getPrice(ProductId)*quantity+" Discount "+discount+"%";
		
	}
	
   
	
}
