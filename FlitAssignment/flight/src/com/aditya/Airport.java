package com.aditya;
import java.util.*;
public class Airport {
	String name="";
	public Airport(String name) {
		this.name = name;
	}
	ArrayList<Flights> Tflight=new ArrayList<>();
	void addFligts(Flights f) {
		
		Tflight.add(f);
	}
	void showFlight() {
		int count=1;
		for(Flights f:Tflight) {
			f.detail();
			count++;
			
		}
	}
	

}
