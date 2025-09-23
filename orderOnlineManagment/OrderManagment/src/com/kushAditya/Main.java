package com.kushAditya;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1=new Product(12,"Milk",40.25);
		Product p2=new Product(13,"flore",35.25);
		Product p3=new Product(14,"rice",100.90);
		Product p4=new Product(15,"curd",60.00);
		Restraunent.showMenue();
		Costumer aditya=new Costumer(1,"aditya kushwaha","aditya.kumar2_cs23@gla.ac.in");
		Costumer gopal=new Costumer(2,"Gopal Prajapati","gopal.prajapati_cs23@gla.ac.in");
		Order o1=new Order(aditya,12,3);
		Order o2=new Order(aditya,15,5);
		Order o3=new Order(gopal,14,4);
		
		System.out.println(aditya.ShowBill());
		System.out.println(gopal.ShowBill());
		
		
		
		
		
		

	}

}
