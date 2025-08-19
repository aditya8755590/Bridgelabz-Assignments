//Create a class Student with name (String) and marks (int).
// Use a constructor to initialize values. Create two objects and print their data.
public class Student {
     String name ;
     int marks;
     Student(String name ,int marks){
        this.name =name;
        this.marks=marks;
     }
     public static void main(String[] args) {
        Student s1=new Student("aditya",100 );
        Student s2=new Student("gopal",28 );
        System.out.println(s1.name+". "+s1.marks);
        System.out.println(s2.name+". "+s2.marks);



     }
    
}