package com.aditya;

public class Course {
	 String courseName;
	    int duration; 
	    Course(String name, int dur){
	        this.courseName = name;
	        this.duration = dur;
	    }

	    void showDetails(){
	        System.out.println("Course: " + courseName + " Duration: " + duration + " weeks");
	    }
}
class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    OnlineCourse(String name, int dur, String plat, boolean rec){
        super(name, dur);
        this.platform = plat;
        this.isRecorded = rec;
    }

    void showDetails(){
        System.out.println("Online Course" + courseName + "Duration" + duration + " weeks Platform  " + platform + " Recorded " + isRecorded);
    }
}
class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    PaidOnlineCourse(String name, int dur, String plat, boolean rec, double f, double d){
        super(name, dur, plat, rec);
        this.fee = f;
        this.discount = d;
    }

    void showDetails(){
        System.out.println("Paid Online Course: " + courseName + ", Duration: " + duration 
            + " weeks, Platform: " + platform + ", Recorded: " + isRecorded 
            + ", Fee: " + fee + ", Discount: " + discount + "%");
    }
}

