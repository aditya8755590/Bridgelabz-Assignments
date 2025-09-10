public class Student {

//     Create a Student class to manage student data with the following features:
// Static:
// ○       A static variable universityName shared across all students.
// ○       A static method displayTotalStudents() to show the number of students enrolled.
// This:
// ○       Use this in the constructor to initialize name, rollNumber, and grade.
// Final:
// ○       Use a final variable rollNumber for each student that cannot be changed.
// Instanceof:
// ○       Check if a given object is an instance of the Student class before performing operations like displaying or updating grades.

    static String universityName="GLA University";
    private final int rollNumber;
    String name="";
    String grade="";
    private static int totalStudents=0;

    Student(int rollNumber,String name,String grade){
        this.rollNumber=rollNumber;
        this.name=name;
        this.grade=grade;
        totalStudents++;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    public static void displayTotalStudents(){
        System.out.println("Total Students: "+totalStudents);
    }

    public void displayDetails(){
        if(this instanceof Student){
            System.out.println("Student Roll Number: "+rollNumber);
            System.out.println("Student Name: "+name);
            System.out.println("Student Grade: "+grade);
        }
        
       else{
            System.out.println("Not a valid Student");
        }
    }
}
