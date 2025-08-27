package com.kush;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparisonExample {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	        String dob=sc.nextLine();
	        LocalDate date1 = LocalDate.parse(dob, formatter);
	        System.out.print("Enter second date (dd-MM-yyyy)");
	        String dob1=sc.nextLine();
	        LocalDate date2 = LocalDate.parse(dob1, formatter);

	        if (date1.isBefore(date2)){
	            System.out.println("First date is before");
	        } 
	        else if (date1.isAfter(date2)){
	            System.out.println("First date is after");
	        }
	        else if (date1.isEqual(date2)){
	            System.out.println("same.");
	        }
}}