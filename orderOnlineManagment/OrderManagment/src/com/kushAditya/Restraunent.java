package com.kushAditya;
import java.util.*;
public class Restraunent {
	
	static ArrayList<Product> menue=new ArrayList<>();
	static ArrayList<Order> orderList=new ArrayList<>();
	
	
	
	
	public static void showMenue() {
		for(Product p:menue) {
			System.out.println(p.productName+" for "+p.price);
		}
		
	}
	public static void OrderFood(int productId,Costumer c,int quantity) {
		double price=getPrice(productId);
		 if(price==-1.0) {
			 System.out.println("ye saman nahi hai ");
		 }
		 c.Bill+=price*quantity;
		
	}
	public static String getName(int prodectid) {
		for(Product p:menue) {
			if(p.productId==prodectid) {
				return p.productName;
			}
		}
	return "Not ablaible";
	}

	public static Double getPrice(int prodectid) {
		for(Product p:menue) {
			if(p.productId==prodectid) {
				return p.price;
			}
		}
		return -1.0;
	}
    public static void  showOrder() {
    	for(Order o:orderList) {
			Order.showInlineOrder(o);
		}
    }
    
}
