package com.aditya;

public class Main {

	public static void main(String[] args) {
		Airport a1=new Airport("indra gandi airport");
		Flights f2=new Flights(20,"mathura","punjab","20-aug",34);
		a1.addFligts(f2);
		Flights f3=new Flights(20,"delhi","pun","20-aug",904);
		a1.addFligts(f3);
		Flights f4=new Flights(20,"haryana","punjab","20-aug",34);
		a1.addFligts(f4);
		Flights f5=new Flights(20,"rajistan","punjab","20-aug",50);
		a1.addFligts(f5);
		Flights f6=new Flights(20,"noida","punjab","20-aug",40);
		a1.addFligts(f6);
		a1.showFlight();
		Passenger p1=new Passenger(24,"aditya kushwaha" );
		Bookings b1=new Bookings(344,424,p1);
		Passenger p2=new Passenger(4244,"kunal kushwaha" );
		Bookings b2=new Bookings(344,424,p2);
		showFlit("delhi" ,"mumbai");
		
		
		
		
        
	}
	public static void showFlit(String d1,String d2){
		
		
		
		
	}

}
