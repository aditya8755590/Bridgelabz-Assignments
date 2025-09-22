package com.aditya;

public class Main {

	public static void main(String[] args) {
		   device d1 = new device();
	        d1.deviceId = 101;
	        d1.status = "ON";
	        d1.displayStatus();
	        
	        
	        
	        // next question 
	        thermostat t1 = new thermostat();
	        t1.deviceId = 202;
	        t1.status = "OFF";
	        t1.temperatureSetting = 24;
	        t1.displayStatus();
	        
	        
	        
	        // this is for interface
	        
	        Chef c1 = new Chef("Ramesh", 101);
	        Waiter w1 = new Waiter("Suresh", 201);

	        c1.performDuties();
	        w1.performDuties();
	        
//  this is for education course hierarchy
	        
	        Course course1 = new Course("Math", 6);
	        OnlineCourse course2 = new OnlineCourse("Java", 8, "Bridgelab", true);
	        PaidOnlineCourse course3 = new PaidOnlineCourse("Spring Boot", 10, "GeeksForGeek", true, 5000, 20);

	        course1.showDetails();
	        course2.showDetails();
	        course3.showDetails();
	}

}
class device {
    int deviceId;
    String status;

    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

class thermostat extends device {
    int temperatureSetting;

    void displayStatus() {
        System.out.println("Device ID" + deviceId);
        System.out.println("Status" + status);
        System.out.println("Temperature set to" + temperatureSetting + " C");
    }
}

