package aditya.com;

public class Main3 {
	
	public static void main(String[] args) {
		Student s1=new Student(1, "aditya", new int[]{90, 85, 88, 92, 80});
		School.addStudent(s1);
		Student s2=new Student(1, "aman", new int[]{90, 8, 88, 40, 80});
		Student s3=new Student(1, "sameer", new int[]{0, 85, 88, 2, 0});
		Student s4=new Student(1, "karan", new int[]{0, 5, 8, 92, 0});
		School.addStudent(s2);
		School.addStudent(s3);
		School.addStudent(s4);
		System.out.println(School.topper());
		
		System.out.println(s1.average());
		
		
		
	}

	public static void searchByName(Student[] students, String keyword) {
	    boolean found = false;
	    for (Student s : students) {
	        if (s != null && s.Name.contains(keyword)){
	            found = true;
	        }
	    }
	    if (!found) {
	        System.out.println("No student found Array");
	    }
	}
}
