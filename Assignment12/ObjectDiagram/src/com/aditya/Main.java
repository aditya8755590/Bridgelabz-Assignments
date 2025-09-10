package com.aditya;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("1984", "Aditya" );
        Book book2 = new Book("ye dil hai ", "prem chandra");
        Book book3 = new Book("think like a monk", "Jay shatty");

        Library library1 = new Library();
        Library library2 = new Library();
        library1.addBook(book1);
        library1.addBook(book2);
        for (Book book : library1.getBooks()) {
            System.out.println( book.getTitle() + "author hai " + book.getAuthor());
        }
        for (Book book : library2.getBooks()) {
            System.out.println( book.getTitle() + "author hai " + book.getAuthor());
        }

       // ------------------------------------------------------------------
       // question 2 
         Bank bank = new Bank("punjab national  Bank");
          Coustmer customer1 = new Coustmer("aditya ", "191919191", 1000.0, bank);
          Coustmer customer2 = new Coustmer("ramsingh ", "12344234242", 2000.0, bank);
    
          System.out.println("Bank Name" + bank.getBankName());
          System.out.println("Customer" + customer1.getName() + ", Account Number" + customer1.getAccountNumber() + ", Balance" + customer1.getBalance());
          System.out.println("Customer" + customer2.getName() + ", Account Number" + customer2.getAccountNumber() + ", Balance" + customer2.getBalance());
          // ------------------------------------------------------------------
        // question 3
        //Show the composition relationship by ensuring that when a Company object is deleted, all associated Department and Employee objects are also removed.
        // give name indian 
        Department.Employee emp1 = new Department.Employee("Aditya", "Developer");
        Department.Employee emp2 = new Department.Employee("Ravi", "Designer");
        Department dept1 = new Department("IT", new Department.Employee[]{emp1, emp2});
        Department.Employee emp3 = new Department.Employee("pokemon", "Manager");
        Department dept2 = new Department("HR", new Department.Employee[]{emp3});
        Company company = new Company("capgemini", new Department[]{dept1, dept2});
        System.out.println("Company: " + company.getName());
        // let's delete the company object
        company = null;
        // Now, all departments and employees associated with the company are also deleted
        //--------------------------------------------------------------------
        // question 4
        // Create a School class that contains multiple Student objects. Each Student should have attributes like name
        // Problem 1: School and Students with Courses (Association and Aggregation)
// Description: Model a School with multiple Student objects, where each student can enroll in multiple courses, and each course can have multiple students.
// Tasks:
// Define School, Student, and Course classes.
// Model an association between Student and Course to show that students can enroll in multiple courses.
// Model an aggregation relationship between School and Student.
// Demonstrate how a student can view the courses they are enrolled in and how a course can show its enrolled students.
// Goal: Practice association by modeling many-to-many relationships between students and courses.

        Student student1 = new Student("Aditya", new String[]{"Math", "Science"});
        Student student2 = new Student("Ravi", new String[]{"History", "Art"});
        School school = new School("RBS High School", new Student[]{student1, student2});
        for (Student student : school.getStudents()) {
            System.out.println("Student: " + student.getName() + ", Courses enrolled:");
            for (String course : student.getCourses()) {
                System.out.println(" - " + course);
            }
        }
        Course course1 = new Course("Math", new String[]{"Aditya", "Ravi"});
        Course course2 = new Course("Science", new String[]{"Aditya"});
        System.out.println("Course: " + course1.getCourseName() + ", Enrolled Students");
        for (String studentName : course1.getEnrolledStudents()) {
            System.out.println(studentName);
        }
        System.out.println("Course: " + course2.getCourseName() + "Enrolled Students");
        for (String studentName : course2.getEnrolledStudents()) {
            System.out.println(studentName);
        }  
        
        // Description: Model a university system with Student, Professor, and Course classes. Students enroll in courses, and professors teach courses. Ensure students and professors can communicate through methods like enrollCourse() and assignProfessor().
    // Goal: Use association and aggregation to create a university system that emphasizes relationships and interactions among students, professors, and courses.
        Professor prof1 = new Professor("Dr. Smith", new String[]{"Math", "Science"});
        Professor prof2 = new Professor("Dr. Johnson", new String[]{"History"});
        Course uniCourse1 = new Course("Math", new String[]{"Aditya"}, prof1.getName());
        Course uniCourse2 = new Course("History", new String[]{"Ravi"}, prof2.getName());
        System.out.println("Course: " + uniCourse1.getCourseName() + ", Taught by: " + uniCourse1.getProfessorName());
        System.out.println("Enrolled Students:");
        for (String studentName : uniCourse1.getEnrolledStudents()) {
            System.out.println(" - " + studentName);
        }
        System.out.println("Course: " + uniCourse2.getCourseName() + "Taught by: " + uniCourse2.getProfessorName());
        System.out.println("Enrolled Students:");
        for (String studentName : uniCourse2.getEnrolledStudents()) {
            System.out.println(" - " + studentName);
        }
    }


    }
