package com.aditya;

// Description: Model a university system with Student, Professor, and Course classes. Students enroll in courses, and professors teach courses. Ensure students and professors can communicate through methods like enrollCourse() and assignProfessor().
// Goal: Use association and aggregation to create a university system that emphasizes relationships and interactions among students, professors, and courses.

public class Professor {
    private String name;
    private String[] coursesTeaching;
    public Professor(String name, String[] coursesTeaching) {
        this.name = name;
        this.coursesTeaching = coursesTeaching;
    }
    public String getName() {
        return name;
    }
    public String[] getCoursesTeaching() {
        return coursesTeaching;
    }
    
}
