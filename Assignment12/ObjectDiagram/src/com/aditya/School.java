package com.aditya;

// Problem 1: School and Students with Courses (Association and Aggregation)
// Description: Model a School with multiple Student objects, where each student can enroll in multiple courses, and each course can have multiple students.
// Tasks:
// Define School, Student, and Course classes.
// Model an association between Student and Course to show that students can enroll in multiple courses.
// Model an aggregation relationship between School and Student.
// Demonstrate how a student can view the courses they are enrolled in and how a course can show its enrolled students.
// Goal: Practice association by modeling many-to-many relationships between students and courses.

public class School {
    private String name;
    private Student[] students;
    public School(String name, Student[] students) {
        this.name = name;
        this.students = students;
    }
    public String getName() {
        return name;
    }
    public Student[] getStudents() {
        return students;
    }
    
}
