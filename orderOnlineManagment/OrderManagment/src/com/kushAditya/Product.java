package com.kushAditya;

public class Product {
	int productId;
	String productName;
	Double price;
	
	public Product(int productId, String productName, Double price) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		add(this);
	}
	public void  add(Product p) {
		Restraunent.menue.add(p);
	}
	

}
