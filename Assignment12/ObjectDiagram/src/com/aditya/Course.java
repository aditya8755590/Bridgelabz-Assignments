package com.aditya;
// Problem 1: School and Students with Courses (Association and Aggregation)
// Description: Model a School with multiple Student objects, where each student can enroll in multiple courses, and each course can have multiple students.
// Tasks:
// Define School, Student, and Course classes.
// Model an association between Student and Course to show that students can enroll in multiple courses.
// Model an aggregation relationship between School and Student.
// Demonstrate how a student can view the courses they are enrolled in and how a course can show its enrolled students.
// Goal: Practice association by modeling many-to-many relationships between students and courses.

class Course{
    private String courseName;
    private String[] enrolledStudents;
    public Course(String courseName, String[] enrolledStudents) {
        this.courseName = courseName;
        this.enrolledStudents = enrolledStudents;
    }
    //  Course uniCourse1 = new Course("Math", new String[]{"Aditya"}, prof1.getName());
    //make a constructor that also takes professor name
    private String professorName;
    public Course(String courseName, String[] enrolledStudents, String professorName) {
        // we use constructor chaining
        this(courseName, enrolledStudents);
        this.professorName = professorName;
    }
    public String getProfessorName() {
        return professorName;
    }
    public String getCourseName() {
        return courseName;
    }
    public String[] getEnrolledStudents() {
        return enrolledStudents;
    }
    
    
}