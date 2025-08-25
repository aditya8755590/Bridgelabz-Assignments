package aditya.com;

public class Student {
	int Roll;
	String Name;
	int[] marks=new int[5];
	
	public Student(int roll, String name, int[] marks) {
		Roll = roll;
		Name = name;
		this.marks = marks;
		School.addStudent(this);
		
	}
	public int totalMarks(){
		int n=marks.length;
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=marks[i];
			
		}
		return sum;
	
		
		
	}
	public double average() {
		int TOTAL_MARKS=totalMarks();
		return TOTAL_MARKS/5.0;
	}
	
	
	
	 public String grade() {
	        double avg = average();
	        if (avg>=90) {
	            return "A+ ye baccha to topper hai lakin kuch nahi hota topper hone se";
	        } else if (avg>=75) {
	            return "A";
	        } else if (avg>=60) {
	            return "B";
	        } else if (avg>=40) {
	            return "C";
	        } else {
	            return "Fail hai ye to ";
	        }
	    }
	
	
	

}
