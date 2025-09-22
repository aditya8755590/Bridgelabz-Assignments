package com.aditya;

public class Passenger {
	int passenger_id;
	String name="";
    static int total_pass=0;

	public Passenger(int passenger_id, String name) {
		this.passenger_id = passenger_id;
		this.name = name;
		total_pass++;
	}
	


}
