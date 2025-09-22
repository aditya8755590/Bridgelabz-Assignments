package com.aditya;

public class Flights {
	
	int flight_id;
    String source;
    String destination;
    String date;
    int capacity;
 
	public Flights(int flight_id, String source, String destination, String date, int capacity) {
		this.flight_id = flight_id;
		this.source = source;
		this.destination = destination;
		this.date = date;
		this.capacity = capacity;
	}
	
	void detail(){
		System.out.println(flight_id+" this is the capicity"+capacity);
		
	}



}
